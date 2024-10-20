package com.equinorte.indicadores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equinorte.indicadores.entities.Indicador;

@Repository
public interface IndicadorRepository extends JpaRepository<Indicador, Long> {//Ya nos trae metodos como get all get by id y otros
    
}
