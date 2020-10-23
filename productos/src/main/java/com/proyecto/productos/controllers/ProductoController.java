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

    @GetMapping("/create/")
    public String nuevoProducto(Producto nuevo){
        Producto producto = productoService.save(nuevo);
        return "crear/nuevoProducto";
    }

    @PutMapping("/edit/{id}/")
    public String editarProducto(@PathVariable Long id, Producto p){
        if (productoService.findById(id) != null) {
             productoService.findById(id).map(editandoProducto -> {
                 editandoProducto.setNombreProducto(p.getNombreProducto());
                 editandoProducto.setPrecio(p.getPrecio());
                 return productoService.save(editandoProducto);
            }).orElseThrow(() -> new NullPointerException());
        }
        return "modificar/producto";
    }

    @DeleteMapping("/delete/{id}/")
    public String deleteProducto(@PathVariable Long id){
        if (productoService.findById(id) != null) {
            Producto p = productoService.findById(id).get();
            productoService.deleteById(id);
        }
        else {
            return "El producto no se puede borrar porque no existe";
        }
        return "listado/productos";
    }


}
