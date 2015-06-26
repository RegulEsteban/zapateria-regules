package org.zapateria.toluca.controllers;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zapateria.toluca.model.Usuario;
import org.zapateria.toluca.repository.UsuarioRepository;
import org.zapateria.toluca.service.PrincipalServiceInterface;
import org.zapateria.toluca.util.SpringServiceFactory;

@Controller
public class PrincipalController{
	
	private static final Logger log = Logger.getLogger(PrincipalController.class.getName());
	
	@Autowired
	PrincipalServiceInterface principalService;
	
	private UsuarioRepository usuarioRepository;

	@RequestMapping(method = RequestMethod.GET, value = "inicio.do")
	public String inicio(){
		log.info("inicio");
		return "principal/inicio";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "login.do")
	public String login_page(Model modelo){
		usuarioRepository = (UsuarioRepository)SpringServiceFactory.createBean("usuarioRepositoryImpl");
//		List<Usuario> listUsers = principalService.findAll();
		List<Usuario> listUsers = usuarioRepository.findAllUsers();
		for (int i = 0; i < listUsers.size(); i++) {
			System.out.println("usu: "+listUsers.get(i).getName());
		}
		return "principal/login";
	}
}
