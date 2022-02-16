package com.maycol.apirest.services;

import com.maycol.apirest.models.UsuarioModel;
import com.maycol.apirest.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {

    @Autowired //Para no instanciar
    UsuarioRepository usuarioRepository;

    //Metodo para obtener informacion
    public ArrayList<UsuarioModel> getUsuarios() {
        // .findAll() --> me devuelve la info del usuario
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    //Metodo para guardar un usuario
    public UsuarioModel saveUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }


}
