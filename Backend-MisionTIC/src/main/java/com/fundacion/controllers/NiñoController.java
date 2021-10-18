package com.fundacion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fundacion.entities.Niño;
import com.fundacion.services.NiñoService;

@Controller
@RequestMapping(value="/niños")
public class NiñoController {
	@Autowired
	private NiñoService servniño;
	
	
	@PostMapping(value="/")
	private ResponseEntity<Void> Add(@RequestBody Niño p){
		servniño.AgregarNiño(p);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping(value="/")
	private ResponseEntity<List<Niño>> FindAll(){
		return new ResponseEntity<List<Niño>>(servniño.ListarNiños(),HttpStatus.OK);
	}
	
	@GetMapping(value="/{doc}")
	private ResponseEntity<Niño> FindByDoc(@PathVariable String doc){
		Niño n= servniño.BuscarNiñosByDoc(doc);
		return new ResponseEntity<Niño>(n,HttpStatus.OK);
	}
	
	@PutMapping(value="/")
	private ResponseEntity<Void> Edit(@RequestBody Niño n){
		servniño.EditarNiño(n);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{doc}")
	private ResponseEntity<Void> Delete(@PathVariable String doc){
		servniño.EliminarNiño(doc);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping(value="/{doc}")
	private ResponseEntity<Void> Apadrinar(@RequestBody Niño n, @PathVariable String doc){
		servniño.Apadrinar(n, doc);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
