package com.teamfive.controler;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newCategoria() {
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("categorias", new Categorias());
		return model;		
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editCategoria(HttpServletRequest request) {
		int categoriaId = Integer.parseInt(request.getParameter("id"));
		Optional<Categorias> categoria=agendaService.get(categoriaId);
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("categorias", categoria);
		return model;		
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteCategoria(HttpServletRequest request) {
		int userId = Integer.parseInt(request.getParameter("idcategorias"));
		agendaService.delete(userId);
		return new ModelAndView("redirect:/");		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveCategoria(@ModelAttribute Categorias categorias) {
		agendaService.saveOrUpdate(categorias);
		return new ModelAndView("redirect:/");
	}

	

}
