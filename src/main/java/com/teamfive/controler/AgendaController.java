package com.teamfive.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.teamfive.service.AgendaService;


@Controller
public class AgendaController {
	
	@Autowired
	
	private AgendaService agendaService;

}
