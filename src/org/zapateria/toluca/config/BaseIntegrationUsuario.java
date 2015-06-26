package org.zapateria.toluca.config;

import java.util.HashMap;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cassandra.core.cql.CqlIdentifier;
import org.springframework.data.cassandra.core.CassandraAdminOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zapateria.toluca.model.Usuario;
import org.zapateria.toluca.util.SpringServiceFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CassandraConfiguration.class)
public abstract class BaseIntegrationUsuario {
	
    @Autowired
	private CassandraAdminOperations adminTemplate;

    @Before
    public void resetKeySpace() {
    	adminTemplate = (CassandraAdminOperations) SpringServiceFactory.createBean("cassandraAdminTemplate");
        adminTemplate.dropTable(CqlIdentifier.cqlId("usuario"));
        adminTemplate.createTable(true, CqlIdentifier.cqlId("usuario"), Usuario.class, new HashMap<String, Object>());
    }
    
}
