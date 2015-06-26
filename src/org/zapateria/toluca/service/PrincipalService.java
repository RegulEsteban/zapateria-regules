package org.zapateria.toluca.service;

import java.util.List;

import org.springframework.data.cassandra.core.CassandraOperations;
import org.zapateria.toluca.model.Usuario;
import org.zapateria.toluca.util.SpringServiceFactory;

public class PrincipalService implements PrincipalServiceInterface{
	
	private CassandraOperations cassandraOperations;
	
	@Override
	public List<Usuario> findAll(){
		cassandraOperations = (CassandraOperations) SpringServiceFactory.createBean("cassandraTemplate");
		List<Usuario> listUsers = cassandraOperations.select("select * from usuario ", Usuario.class);
		return listUsers;
	}

}
