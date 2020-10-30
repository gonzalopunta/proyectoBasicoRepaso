package com.proyecto.productos.controllers;

import com.proyecto.productos.models.Usuario;
import com.proyecto.productos.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping("/")
    public String iniciarSesion(Usuario usuario, Model u){
        u.addAttribute("usuario", usuario);
        return "index";
    }
}
