package com.proyecto.productos.controllers;

import com.proyecto.productos.models.Categoria;
import com.proyecto.productos.services.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/categoria")
@RequiredArgsConstructor
public class CategoriaController {

    private final CategoriaService categoriaService;

    @GetMapping("/")
    public String mostrarTodas(Model c){
        c.addAttribute("categoria", categoriaService.mostrarCategorias());
        return "listado/categorias";
    }

    @GetMapping("/create")
    public String nuevaCategoria(Model c){
        c.addAttribute("categoria", new Categoria());
        return "crear/nuevaCategoria";
    }

    @PostMapping("/create")
    public String anadirCategoria(Categoria nueva){
        categoriaService.save(nueva);
        return "redirect:/listado/categorias";
    }

    @PutMapping("/edit/{id}")
    public Categoria editarCategoria(@PathVariable Long id, Categoria c){
        return categoriaService.findById(id).map( categoria -> {
            categoria.setNombre(c.getNombre());
            return categoria;
        }).orElseThrow(() -> new NullPointerException());
    }

    @DeleteMapping("/delete/{id}")
    public Categoria borrarCategoria(@PathVariable Long id){
        if (categoriaService.findById(id) != null){
            Categoria c = categoriaService.findById(id).get();
            categoriaService.deleteById(id);
            return c;
        }
        else {
            return null;
        }
    }
}
