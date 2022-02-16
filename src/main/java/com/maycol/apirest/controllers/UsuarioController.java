package com.maycol.apirest.controllers;

import com.maycol.apirest.models.UsuarioModel;
import com.maycol.apirest.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {

    @Autowired //realiza una instancia automatica
    UsuarioService usuarioService;

    @GetMapping() //Indica que recibe request de tipo GET
    public ArrayList<UsuarioModel> getUsuarios() {
        return usuarioService.getUsuarios();
    }

    @PostMapping() //Indica que recibe request de tipo POST
    public UsuarioModel saveUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.saveUsuario(usuario);
    }

}
