package com.darkcode.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darkcode.app.domain.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    List<Usuario> findByNombre(String nombre);
    
}