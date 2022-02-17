package com.maycol.apirest.services;

import com.maycol.apirest.models.UsuarioModel;
import com.maycol.apirest.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    //Obtiene a los usuarios mayores de edad
    public List<UsuarioModel> getAgeOver18() {
        ArrayList<UsuarioModel> usuarios = this.getUsuarios();
        return usuarios.stream().filter(user -> user.getEdad() >= 18).collect(Collectors.toList());
    }
    //Obtener usuario menores de edad
    public List<UsuarioModel> getAgeDown18() {
        ArrayList<UsuarioModel> usuarios = this.getUsuarios();
        return usuarios.stream().filter(user -> user.getEdad() < 18).collect(Collectors.toList());
    }


    //Obtiene a los usuarios por el nombre
    public ArrayList<UsuarioModel> getByNombre(String nombre){
        return this.usuarioRepository.findByNombre(nombre);
    }

}
