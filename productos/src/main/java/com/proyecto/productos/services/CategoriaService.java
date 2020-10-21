package com.proyecto.productos.services;

import com.proyecto.productos.models.Categoria;
import com.proyecto.productos.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaService extends ServicioBaseImpl <Categoria, Long, CategoriaRepository>{

    public List<Categoria> mostrarCategorias(){
        return this.findAll().stream().map(c -> {
            c.setNombre(c.getNombre());
            return c;
        }).collect(Collectors.toList());
    }

}
