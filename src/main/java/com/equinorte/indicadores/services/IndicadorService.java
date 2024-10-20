package com.equinorte.indicadores.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equinorte.indicadores.entities.Indicador;
import com.equinorte.indicadores.repositories.IndicadorRepository;

@Service
public class IndicadorService {
    @Autowired
    IndicadorRepository indicadorRepository;


    public Indicador guardarIndicador(Indicador indicador) {
        return indicadorRepository.save(indicador);
    }

    public Indicador actualizarIndicador(Indicador indicador) {
        return indicadorRepository.save(indicador);
    }

    public List<Indicador> getAllIndicadores() {
        return indicadorRepository.findAll();
    }

    public Optional<Indicador> getIndicadorByid(Long  id) {
        return indicadorRepository.findById(id);
    }

    public void eliminarIndicador(Long id) {
     indicadorRepository.deleteById(id);
    }
    
}
