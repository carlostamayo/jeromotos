package com.jeromotos.api.taller.usuario;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
    private UsuarioServiceImpl usuarioService;

    public UsuarioController (UsuarioServiceImpl usuarioService) {this.usuarioService = usuarioService; }

    @GetMapping("/{id}")
    public Usuario findOne(@PathVariable Long id) {return this.usuarioService.findById(id);}

    @GetMapping
    public List<Usuario> findAll () {return this.usuarioService.findAll();}

    @PostMapping
    public Usuario add (@RequestBody Usuario usuario) {return this.usuarioService.add(usuario);}

    @PutMapping("/{id}")
    public void update (@PathVariable Long id, @RequestBody Usuario usuario) {
        Usuario existingUsuario = usuarioService.findById(id);
        if(null == existingUsuario){return;}
        existingUsuario.setCedula(usuario.getCedula());
        existingUsuario.setNombre(usuario.getNombre());
        existingUsuario.setTelefono(usuario.getTelefono());
        existingUsuario.setCiudad(usuario.getCiudad());
        existingUsuario.setDireccion(usuario.getDireccion());
        existingUsuario.setEmail(usuario.getEmail());
        existingUsuario.setRol(usuario.getRol());
        usuarioService.update(existingUsuario);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id) {this.usuarioService.delete(id);}
}
