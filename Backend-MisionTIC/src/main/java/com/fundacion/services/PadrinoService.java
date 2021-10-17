package com.fundacion.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundacion.entities.Padrino;
import com.fundacion.repositories.PadrinoRepository;

@Service
public class PadrinoService {

	@Autowired
	private PadrinoRepository padrinorepository;
	
	@Autowired
	private PersonaService persService;
	@Transactional
	public void Agregarpadrino(Padrino p) {
		padrinorepository.save(p);
		//persService.AgregarPersona(p.getPersona());
	}
	@Transactional
	public void Eliminarpadrino(String doc) {
		padrinorepository.delete(padrinorepository.findByPersona(persService.BuscarPersonasById(doc))
				.orElseThrow(() -> new RuntimeException("No se encuentra a la padrino que se desea eliminar")));
		//persService.EliminarPersona(doc);
	}

	public List<Padrino> Listarpadrinos() {
		return padrinorepository.findAll();
	}

	public Padrino BuscarpadrinosById(String doc) {
		Padrino p= padrinorepository.findByPersona(persService.BuscarPersonasById(doc)).orElseThrow(() -> new RuntimeException("No existe la padrino"));
		return p;
	}
	@Transactional
	public Padrino Editarpadrino(Padrino pad) {
		System.out.println("2");
		Padrino padrinoExiste = padrinorepository.findByPersona(pad.getPersona()).orElseThrow(()-> new RuntimeException("No se encontro un padrino con este documento"));
		System.out.println("3");
		padrinoExiste.setEmail(pad.getEmail());
		padrinoExiste.setCiudad_res(pad.getCiudad_res());
		padrinoExiste.setTelefono(pad.getTelefono());
		padrinoExiste.setContrasena(pad.getContrasena());
		padrinoExiste.setPersona(pad.getPersona());
		System.out.println("4");
		
		//persService.EditarPersona(padrinoExiste.getPersona());
		System.out.println("9");
		padrinorepository.save(padrinoExiste);
		System.out.println("10");
		return padrinoExiste;
	}
}