package org.zapateria.toluca.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.zapateria.toluca.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	public List<Usuario> findAllUsers();
}
