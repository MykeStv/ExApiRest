package com.maycol.apirest.repositories;

import com.maycol.apirest.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//extiende de la clase CrudRepository <modelo, tipo de dato del identificado>
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

}
