package com.equinorte.indicadores.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Indicador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Column(nullable = false)
    private String nombre;

    @NotNull(message = "El valor esperado no puede ser nulo")
    @Column(nullable = false)
    private double valorEsperado;

    @NotNull(message = "El valor mínimo no puede ser nulo")
    @Column(nullable = false)
    private double valorMinimo;

    @NotNull(message = "El valor máximo no puede ser nulo")
    @Column(nullable = false)
    private double valorMaximo;
}