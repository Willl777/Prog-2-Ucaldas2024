package com.darkcode.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darkcode.app.domain.Libro;
import com.darkcode.app.repository.LibroRepositorio;

@Service
public class LibroService implements AppService<Libro> {

    @Autowired
    private LibroRepositorio libroRepositorio;

    @Override
    public void create(Libro libro) {
        libroRepositorio.save(libro);
    }

    @Override
    public Libro edit(Long id) {
        Optional<Libro> optionalLibro = libroRepositorio.findById(id);
        if (optionalLibro.isPresent()) {
            return optionalLibro.get();
        } else {
            throw new RuntimeException("No se encontró ningún libro con el id: " + id);
        }
    }

    @Override
    public List<Libro> findAll() {
        return libroRepositorio.findAll();
    }

    public void delete(Long id) {
        if (libroRepositorio.existsById(id)) {
            libroRepositorio.deleteById(id);
        } else {
            throw new RuntimeException("No se eliminó, no existe el libro en el repositorio bajo id: " + id);
        }
    }

    public void update(Libro libro) {
        if (libroRepositorio.existsById(libro.getId())) {
            libroRepositorio.save(libro);
        } else {
            throw new RuntimeException("No se actualizó, no existe el libro en el repositorio bajo id: " + libro.getId());
        }
    }

    public List<Libro> findBooks(String titulo, String autor, String genero) {
        if (titulo != null && !titulo.isEmpty()) {
            return libroRepositorio.findByTituloContaining(titulo);
        } else if (autor != null && !autor.isEmpty()) {
            return libroRepositorio.findByAutorContaining(autor);
        } else if (genero != null && !genero.isEmpty()) {
            return libroRepositorio.findByGeneroContaining(genero);
        } else {
            return findAll();
        }
    }
}