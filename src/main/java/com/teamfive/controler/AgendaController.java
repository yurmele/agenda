package com.teamfive.controler;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private AgendaService agendaService;
	
	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {		
		Iterable<Personas> listUsers = agendaService.listPersonas();
		Iterable<Departamentos> listDepar = agendaService.listDepartamentos();
		Iterable<Categorias> listCat= agendaService.listCategoria();
		
		ModelAndView model = new ModelAndView("inicio");
		
		model.addObject("categorias", new Categorias());
		model.addObject("depart", new Departamentos());
		model.addObject("person",new Personas());
		
		model.addObject("userList", listUsers);
		model.addObject("departamentos", listDepar);
		model.addObject("userCat", listCat);
		return model;
	}	
	
	
	@RequestMapping(value = "/agregarcontacto", method = RequestMethod.POST)
	public ModelAndView newEmpleado(HttpServletRequest request, Personas person) {
		//log.info(request.getParameter("departaname"));
		
		agendaService.savePerson(person, Integer.parseInt(request.getParameter("departaname")),
				Integer.parseInt(request.getParameter("categoriasname")));
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}
	@RequestMapping(value = "/modificarEmpleado", method = RequestMethod.POST)
	public ModelAndView modifcarEmpleado(int id,String nomb,String ap1,String ap2) {
		log.info(ap1);
		Optional<Personas> user = agendaService.findbyIdPerson(id);
		Personas per=user.get();
		per.setNombre(nomb);
		per.setApellido1(ap1);
		per.setApellido2(ap2);
				agendaService.savePerson(per,4,4);
		//agendaService.savePerson(person, 4,4);
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}

	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editCategoria(HttpServletRequest request) {		
		int categoriaId = Integer.parseInt(request.getParameter("id"));
		Optional<Categorias> categoria=agendaService.getCategoria(categoriaId);
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("categorias", categoria);
		return model;		
	}
	
	@RequestMapping(value = "/delete")
	public ModelAndView deleteCategoria(HttpServletRequest request) {
		int userId = Integer.parseInt(request.getParameter("idcategorias"));
		agendaService.deleteCategoria(userId);
		return new ModelAndView("redirect:/");		
	}
	@RequestMapping(value = "/deleteDepartamentos")
	public ModelAndView deleteDepartamentos(HttpServletRequest request) {
		int personId = Integer.parseInt(request.getParameter("iddepartamento"));
		agendaService.deleteDepartamento(personId);
		return new ModelAndView("redirect:/");		
	}
	@RequestMapping(value = "/deletePersonas")
	public ModelAndView deletePersonas(HttpServletRequest request) {
		int depId = Integer.parseInt(request.getParameter("idpersonas"));
		agendaService.deletePersonas(depId);
		return new ModelAndView("redirect:/");		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveCategoria(@ModelAttribute Categorias categorias) {
		agendaService.saveCategoria(categorias);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/agregarCategorias", method = RequestMethod.POST)
	public ModelAndView agregarCategoria(Categorias categorias) {
		agendaService.saveCategoria(categorias);
		ModelAndView model = new ModelAndView("redirect:/");
		return model;		
	}
	
		
		
	@RequestMapping(value = "/agregarDepartamentos", method = RequestMethod.POST)
	public ModelAndView agregarDepartamentos(Departamentos departamentos) {
		agendaService.saveDepartamento(departamentos);
		ModelAndView model = new ModelAndView("redirect:/");
		return model;		
	}

}
