package org.zapateria.toluca.repository;

import java.util.List;

import org.springframework.cassandra.core.util.CollectionUtils;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.zapateria.toluca.config.GenericCassandraRepository;
import org.zapateria.toluca.model.Usuario;

public class UsuarioRepositoryImpl extends GenericCassandraRepository<Usuario, Integer> implements UsuarioRepository{
	
	public UsuarioRepositoryImpl(CassandraOperations operations) {
		super(operations);
	}

	@Override
    public List<Usuario> findAllUsers() {
        return CollectionUtils.toList(super.findAll());
    }
}
