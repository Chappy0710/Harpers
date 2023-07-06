package com.Harpers.Servicio;

import com.Harpers.dto.UsuarioRegistroDTO;
import com.Harpers.registroUsuario.Usuario;

/**
 *
 * @author Aaron
 */
public interface UsuarioServicio {
    public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO);
    
    
}
