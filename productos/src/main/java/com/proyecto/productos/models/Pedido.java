package com.proyecto.productos.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity @Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Pedido {

    @Id @GeneratedValue
    private long id;

    private String fecha;
    private boolean estado;

    @OneToMany
    private Usuario idCliente;

}
