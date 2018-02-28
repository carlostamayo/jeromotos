package com.jeromotos.api.taller.usuario;

import java.util.List;

public interface UsuarioService {
    public Usuario findById (Long id);
    public List<Usuario> findAll ();
    public Usuario add (Usuario usuario);
    public void update (Usuario usuario);
    public void delete (Long id);
}
