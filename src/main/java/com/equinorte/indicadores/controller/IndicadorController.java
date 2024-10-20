package com.equinorte.indicadores.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equinorte.indicadores.entities.Indicador;
import com.equinorte.indicadores.services.IndicadorService;

@RestController
@RequestMapping("/indicadores")
@CrossOrigin(origins = "http://localhost:4200")
public class IndicadorController {
    
    @Autowired
    IndicadorService indicadorService;

    @PostMapping
    public ResponseEntity<Indicador> guardarIndicador(@RequestBody Indicador indicador) {
        try {
            Indicador guardaIndicador = indicadorService.guardarIndicador(indicador);
            return new ResponseEntity<>(guardaIndicador, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Indicador> updateIndicador(@PathVariable Long id, @RequestBody Indicador indicador) {
        try {
            indicador.setId(id);  
            Indicador actualizarIndicador = indicadorService.actualizarIndicador(indicador);
            return new ResponseEntity<>(actualizarIndicador, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<List<Indicador>> getAllindicador(){
        return new ResponseEntity<>(indicadorService.getAllIndicadores(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Indicador> getIndicadorById(@PathVariable Long id) {
        Optional<Indicador> book = indicadorService.getIndicadorByid(id);
        return book.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() ->
                new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) throws IOException {
        Optional<Indicador> indicador = indicadorService.getIndicadorByid(id);
        if (indicador.isPresent()){
            indicadorService.eliminarIndicador(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
