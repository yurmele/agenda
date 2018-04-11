package com.teamfive.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teamfive.model.Categorias;
import com.teamfive.model.Personas;
import com.teamfive.service.AgendaService;


@Controller
public class AgendaController {
	
	@Autowired
	private AgendaService agendaService;
	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		listCategoria();	
		Iterable<Personas> listUsers = agendaService.list();
		ModelAndView model = new ModelAndView("inicio");
		model.addObject("userList", listUsers);
		return model;
	}	
	
	@RequestMapping("/newCategoria")
	public ModelAndView listCategoria () throws Exception {
		Iterable<Categorias> listCategorias = agendaService.listCategoria();
		ModelAndView model = new ModelAndView("inicio");
		model.addObject("categorias", listCategorias);
		return model;
	}
	

}
