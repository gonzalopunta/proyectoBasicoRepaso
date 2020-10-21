package com.proyecto.productos.services;

import com.proyecto.productos.models.Usuario;
import com.proyecto.productos.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends ServicioBaseImpl<Usuario, Long, UsuarioRepository>{
}
