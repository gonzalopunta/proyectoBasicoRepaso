package com.proyecto.productos.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity @Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Usuario {

    @Id @GeneratedValue
    private long id;

    private String nombre;
    private String apellidos;
    private String email;
    private boolean esAdmin;
}
