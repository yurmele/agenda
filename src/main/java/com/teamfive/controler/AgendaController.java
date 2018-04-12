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
import com.teamfive.model.Departamentos;
import com.teamfive.model.Personas;
import com.teamfive.service.AgendaService;


@Controller
public class AgendaController {
	
	@Autowired
	private AgendaService agendaService;
	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {		
		Iterable<Personas> listUsers = agendaService.list();
		Iterable<Departamentos> listDepar = agendaService.listDepartamentos();
		Iterable<Categorias> listCat= agendaService.listCategoria();
		ModelAndView model = new ModelAndView("inicio");
		model.addObject("categorias", new Categorias());
		model.addObject("depart", new Departamentos());
		model.addObject("userList", listUsers);
		model.addObject("departamentos", listDepar);
		model.addObject("userCat", listCat);
		model.addObject("person",new Personas());
		return model;
	}	
	
	@RequestMapping(value = "/agregarcontacto", method = RequestMethod.POST)
	public ModelAndView newCategoria(Personas person) {
		agendaService.savePerson(person);
		ModelAndView model = new ModelAndView("redirect:/");
		return model;		
	}	
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editCategoria(HttpServletRequest request) {		
		int categoriaId = Integer.parseInt(request.getParameter("id"));
		Optional<Categorias> categoria=agendaService.get(categoriaId);
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("categorias", categoria);
		return model;		
	}
	
	@RequestMapping(value = "/delete")
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
	
	@RequestMapping(value = "/agregarCategorias", method = RequestMethod.POST)
	public ModelAndView agregarCategoria(Categorias categorias) {
		agendaService.saveOrUpdate(categorias);
		ModelAndView model = new ModelAndView("redirect:/");
		return model;		
	}
	
		
		
	@RequestMapping(value = "/agregarDepartamentos", method = RequestMethod.POST)
	public ModelAndView agregarDepartamentos(Departamentos departamentos) {
		agendaService.saveOrUpdateDepartamentos(departamentos);
		ModelAndView model = new ModelAndView("redirect:/");
		return model;		
	}	

	

}
