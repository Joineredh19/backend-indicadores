package com.equinorte.indicadores.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class RegistroHistoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "El valor medido no puede ser nulo")
    @Column(nullable = false)
    private double valorMedido;

    @NotNull(message = "La fecha no puede ser nula")
    @Column(nullable = false)
    private LocalDate fecha;

    @NotNull(message = "La Descripcion no puede ser nulo")
    @Column(nullable = false)
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "indicador_id")
    private Indicador indicador;
}
