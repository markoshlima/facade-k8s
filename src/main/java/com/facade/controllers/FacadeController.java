package com.facade.controllers;

import com.facade.model.Cliente;
import com.facade.services.FacadeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@CrossOrigin(origins = "http://localhost:5006") //localhost
@RequestMapping("/")
public class FacadeController {

	@Autowired
	private FacadeService service;

	@GetMapping(path = "cliente-geral/{clienteID}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public Cliente get(@PathVariable Integer clienteID){
		return service.getClienteOverview(clienteID);
	}
  
}
