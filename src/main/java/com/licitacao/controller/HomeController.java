package com.licitacao.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/api")
public class HomeController {

	@GetMapping(path="/teste")
	public ResponseEntity<String> teste(){
		return new ResponseEntity<String>("Teste",HttpStatus.OK);
	}
	
}
