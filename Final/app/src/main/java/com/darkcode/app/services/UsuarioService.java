package com.darkcode.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darkcode.app.domain.Libro;
import com.darkcode.app.domain.Usuario;
import com.darkcode.app.repository.UsuarioRepositorio;

@Service
public class UsuarioService implements AppService<Usuario> {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @Autowired
    LibroService libroService;

    @Override
    public void create(Usuario usuario) {
        usuarioRepositorio.save(usuario);
    }

    @Override
    public Usuario edit(Long id) {
        Optional<Usuario> optionalUsuario = usuarioRepositorio.findById(id);
        if (optionalUsuario.isPresent()) {
            return optionalUsuario.get();
        } else {
            throw new RuntimeException("No se pudo editar, no se encontró ningún usuario bajo el id: " + id);
        }
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepositorio.findAll();
    }

    public List<Libro> lendBook(String titulo, String autor, String genero) {
        return libroService.findBooks(titulo, autor, genero);
    }
}