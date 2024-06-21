package com.darkcode.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darkcode.app.services.UsuarioServices;

import com.darkcode.app.domain.Usuario;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/cine")
public class UsuarioController {
    
    @Autowired
    private UsuarioServices usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        List<Usuario> usuario = usuarioService.listarUsuarios();
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    public void crearUsuario(@RequestBody Usuario usuarioAux){
        usuarioService.agregarUsuario(usuarioAux); 
    }

    @PutMapping("/{id}")
    public Usuario editarUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
        usuarioService.editarUsuario(id, usuario);
        return busquedaUsuario(id); 
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Integer id){
        usuarioService.eliminarUsuario(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public Usuario busquedaUsuario(@PathVariable Integer id){
        return usuarioService.buscarUsuarioPorId(id);
    }
}