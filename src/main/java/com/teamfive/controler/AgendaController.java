package com.teamfive.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teamfive.model.Personas;
import com.teamfive.service.AgendaService;


@Controller
public class AgendaController {
	
	@Autowired
	private AgendaService agendaService;
	@Autowired
	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		Iterable<Personas> listUsers = agendaService.list();
		ModelAndView model = new ModelAndView("inicio");
		model.addObject("userList", listUsers);
		return model;
	}
	

}
