package com.darkcode.app;

import java.util.List;

import com.darkcode.app.domain.Libro;
import com.darkcode.app.domain.Usuario;
import com.darkcode.app.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public void agregarUsuario(@RequestBody Usuario usuario) {
        usuarioService.create(usuario);
    }

    @PutMapping("/{id}")
    public void actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        usuarioService.edit(id);
    }

    @GetMapping
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable Long id) {
        return usuarioService.edit(id);
    }

    @PostMapping("/prestarLibro")
    public List<Libro> prestarLibro(@RequestParam(required = false) String titulo,
                                    @RequestParam(required = false) String autor,
                                    @RequestParam(required = false) String genero) {
        return usuarioService.lendBook(titulo, autor, genero);
    }
}