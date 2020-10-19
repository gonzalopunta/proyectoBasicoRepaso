package com.proyecto.productos.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity @Data @Builder @AllArgsConstructor @NoArgsConstructor
public class LineaPedido {

    @Id @GeneratedValue
    private long id;

    @ManyToOne
    private Pedido idPedido;

    @ManyToOne
    private Producto idProducto;

}
