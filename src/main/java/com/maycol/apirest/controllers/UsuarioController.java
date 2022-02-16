package com.maycol.apirest.controllers;

import com.maycol.apirest.models.UsuarioModel;
import com.maycol.apirest.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Optional;

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

    @GetMapping(path = "/{id}") //para identificar que se adiciona el id
    public Optional<UsuarioModel> getUsuarioById(@PathVariable("id") Long id) {
        //@PathVariable("id") toma el id del path
        return this.usuarioService.getById(id);
    }

    @GetMapping("/query") // una ruta adicional al path
    //pedimos un parametro "prioridad" --> /usuario/query?parametro=3
    public ArrayList<UsuarioModel> getUsuarioByPrioridad(@RequestParam("prioridad") Integer prioridad) {
        return this.usuarioService.getByPrioridad(prioridad);
    }

    //Metodo para eliminar un usuario
    @DeleteMapping( path = "/{id}") //pasamos el path con el id que queremos eliminar
    public String deleteUsuario(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.deleteUsuario(id);
        if(ok) {
            return "Se eliminó usuario con id " + id;
        } else {
            return "No se pudo eliminar el usuario con id " + id;
        }
    }

}
