package com.darkcode.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.darkcode.app.domain.Libro;
import com.darkcode.app.services.LibroService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping
    public void addLibro(@RequestBody Libro libro) {
        libroService.create(libro);
    }

    @PutMapping("/{id}")
    public void updateLibro(@PathVariable Long id, @RequestBody Libro libro) {
        libro.setId(id);
        libroService.update(libro);
    }

    @DeleteMapping("/{id}")
    public void deleteLibro(@PathVariable Long id) {
        libroService.delete(id);
    }

    @GetMapping("")
    public List<Libro> getAllLibros() {
        return libroService.findAll();
    }

    @GetMapping("/search")
    public List<Libro> searchLibros(@RequestParam(required = false) String titulo,
                                    @RequestParam(required = false) String autor,
                                    @RequestParam(required = false) String genero) {
        return libroService.findBooks(titulo, autor, genero);
    }
}