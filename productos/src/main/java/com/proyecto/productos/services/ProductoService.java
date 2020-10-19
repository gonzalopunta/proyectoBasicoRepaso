package com.proyecto.productos.services;

import com.proyecto.productos.models.Producto;
import com.proyecto.productos.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoService extends ServicioBaseImpl <Producto, Long, ProductoRepository>{

    public List<Producto> mostrarProductos(){
        return this.findAll().stream().map(p -> {
            p.setNombreProducto(p.getNombreProducto());
            p.setPrecio(p.getPrecio());
            p.setEstado(p.isEstado());
            return p;
        }).collect(Collectors.toList());
    }

}
