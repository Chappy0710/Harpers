package com.Harpers.repositorio;

import com.Harpers.registroUsuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aaron
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
    
}
