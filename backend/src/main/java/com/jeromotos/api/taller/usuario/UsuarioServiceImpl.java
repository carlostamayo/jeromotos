package com.jeromotos.api.taller.usuario;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl (UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario findById (Long id) {return this.usuarioRepository.findOne(id);}

    @Override
    public List<Usuario> findAll () {return this.usuarioRepository.findAll();}

    @Override
    public Usuario add (Usuario usuario) {
        this.usuarioRepository.save(usuario);
        return usuario;
    }

    @Override
    public void update (Usuario usuario) {
        this.usuarioRepository.save(usuario);
    }

    @Override
    public void delete (Long id) {
        this.usuarioRepository.delete(id);
    }

}
