package com.darkcode.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.darkcode.app.domain.Libro;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long> {
    List<Libro> findByTituloContaining(String titulo);
    List<Libro> findByAutorContaining(String autor);
    List<Libro> findByGeneroContaining(String genero);
}