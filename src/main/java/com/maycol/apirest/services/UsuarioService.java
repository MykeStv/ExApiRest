package com.maycol.apirest.services;

import com.maycol.apirest.models.UsuarioModel;
import com.maycol.apirest.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

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

    //Se coloca Optional por si no se encuentra el id
    public Optional<UsuarioModel> getById(Long id) {
        return usuarioRepository.findById(id);
    }

    //Busca los usuarios segun su prioridad
    public ArrayList<UsuarioModel> getByPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    //Elimina el usuario por id
    public boolean deleteUsuario(Long id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            //Si el metodo falla retornar falso
            return false;
        }
    }


}
