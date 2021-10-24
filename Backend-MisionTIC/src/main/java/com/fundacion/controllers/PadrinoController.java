package com.fundacion.controllers;

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
import java.util.List;
import com.fundacion.entities.Padrino;
import com.fundacion.services.PadrinoService;

@Controller
@RequestMapping(value="/padrinos")
public class PadrinoController {
	
	@Autowired
	private PadrinoService servPadrino;
	
	@CrossOrigin(value="*")
	@PostMapping(value="/")
	private ResponseEntity<Void> Add(@RequestBody Padrino p){
		servPadrino.Agregarpadrino(p);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@CrossOrigin(value="*")
	@GetMapping(value="/")
	private ResponseEntity<List<Padrino>> FindAll(){
		return new ResponseEntity<List<Padrino>>(servPadrino.Listarpadrinos(),HttpStatus.OK);
	}
<<<<<<< HEAD

=======
	
>>>>>>> main
	@CrossOrigin(value="*")
	@GetMapping(value="/{doc}")
	private ResponseEntity<Padrino> FindByDoc(@PathVariable String doc){
		Padrino p= servPadrino.BuscarpadrinosById(doc);
		return new ResponseEntity<Padrino>(p,HttpStatus.OK);
	}
	
	@CrossOrigin(value="*")
	@PutMapping(value="/")
	private ResponseEntity<Void> Edit(@RequestBody Padrino p){
		System.out.println("1");
		servPadrino.Editarpadrino(p);
		System.out.println("11");
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
<<<<<<< HEAD
=======
	
>>>>>>> main
	@CrossOrigin(value="*")
	@DeleteMapping(value="/{doc}")
	private ResponseEntity<Void> Delete(@PathVariable String doc){
		servPadrino.Eliminarpadrino(doc);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}