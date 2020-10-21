package com.proyecto.productos.repository;

import com.proyecto.productos.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
}
