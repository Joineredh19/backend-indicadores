package com.equinorte.indicadores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equinorte.indicadores.entities.RegistroHistoria;

@Repository
public interface RegistroHistoriaRepository extends JpaRepository<RegistroHistoria, Long> {
    
}
