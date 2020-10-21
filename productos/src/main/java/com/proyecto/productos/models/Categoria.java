package com.proyecto.productos.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Categoria {

    @Id @GeneratedValue
    private long id;

    private String nombre;
}
