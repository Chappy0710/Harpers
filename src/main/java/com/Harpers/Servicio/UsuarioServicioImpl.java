package com.Harpers.Servicio;

import com.Harpers.dto.UsuarioRegistroDTO;
import com.Harpers.registroUsuario.Rol;
import com.Harpers.registroUsuario.Usuario;
import com.Harpers.repositorio.UsuarioRepositorio;
import java.util.Arrays;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aaron
 */
@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getNombre(),
                                      registroDTO.getApellido(),
                                      registroDTO.getEmail(),
                                      registroDTO.getPassword(), Arrays.asList(new Rol("ROLE_USER")));

        return usuarioRepositorio.save(usuario);
    }

}
