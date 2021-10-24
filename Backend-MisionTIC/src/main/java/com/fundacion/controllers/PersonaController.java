package com.fundacion.controllers;


<<<<<<< HEAD
=======
/*
>>>>>>> main
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fundacion.entities.Persona;
import com.fundacion.services.PersonaService;

@Controller
@RequestMapping(value="personas")

public class PersonaController {
	
	@Autowired
	PersonaService persService;

	@CrossOrigin(value="*")
	@GetMapping(value="/")
	public ResponseEntity<List<Persona>> FindAll(){
		return new ResponseEntity<>(persService.ListarPersonas(), HttpStatus.OK);
	}
	
	@CrossOrigin(value="*")
	@GetMapping(value="/{doc}")
	public ResponseEntity<Persona> FindByDoc(@PathVariable String doc){
		return new ResponseEntity<Persona>(persService.BuscarPersonasById(doc), HttpStatus.OK);
	}
	
	@CrossOrigin(value="*")
	@PostMapping(value="/")
	public ResponseEntity<Void> Create(@RequestBody Persona p){
			persService.AgregarPersona(p);
			return new ResponseEntity<Void>(HttpStatus.CREATED);	
	}
<<<<<<< HEAD
=======
	
>>>>>>> main
	@CrossOrigin(value="*")
	@DeleteMapping(value="/{documento}")
	public ResponseEntity<Void> Delete(@PathVariable String documento){
		persService.EliminarPersona(documento);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
<<<<<<< HEAD
=======
	
>>>>>>> main
	@CrossOrigin(value="*")
	@PutMapping(value="/")
	public ResponseEntity<Void> Update(@RequestBody Persona p){
		persService.EditarPersona(p);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
