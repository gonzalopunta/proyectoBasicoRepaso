package com.proyecto.productos.controllers;

import com.proyecto.productos.models.Producto;
import com.proyecto.productos.services.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoService productoService;

    @GetMapping("/")
    public String mostrarTodos(Model p){
        p.addAttribute("listado", productoService.mostrarProductos());
        return"listado/productos";
    }

    @PostMapping("/create")
    public Producto nuevoProducto(Producto nuevo){
        return productoService.save(nuevo);
    }

    @PutMapping("/edit/{id}")
    public Producto editarProducto(@PathVariable Long id, Producto p){
        return productoService.findById(id).map(editandoProducto -> {
        editandoProducto.setNombreProducto(p.getNombreProducto());
        editandoProducto.setPrecio(p.getPrecio());
        return productoService.save(editandoProducto);
        }).orElseThrow(() -> new NullPointerException());
    }

    @DeleteMapping("/delete/{id}")
    public Producto deleteProducto(@PathVariable Long id){
        if (productoService.findById(id) != null) {
            Producto p = productoService.findById(id).get();
            productoService.deleteById(id);
            return p;
        }
        else {
            return null;
        }
    }


}
