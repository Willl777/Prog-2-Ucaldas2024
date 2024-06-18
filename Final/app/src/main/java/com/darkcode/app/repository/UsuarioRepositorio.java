package com.darkcode.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.darkcode.app.domain.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    
}
