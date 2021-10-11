package com.fundacion.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundacion.entities.Persona;
import com.fundacion.repositories.PersonaRepository;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personarepostory;
	
	@Transactional
	public void AgregarPersona(Persona p) {
			personarepostory.save(p);
	}
	
	@Transactional
	public void EliminarPersona(String doc) {
		personarepostory.delete(personarepostory.findById(doc)
				.orElseThrow(() -> new RuntimeException("No se encuentra a la persona que se desea eliminar")));
	}

	public List<Persona> ListarPersonas() {
		return personarepostory.findAll();
	}

	public Persona BuscarPersonasById(String doc) {
		return personarepostory.findById(doc).orElseThrow(() -> new RuntimeException("No existe la Persona"));
	}
	
	@Transactional
	public Persona EditarPersona(Persona per) {
		
		Persona personaExiste = personarepostory.findById(per.getDoc())
				.orElseThrow(() -> new RuntimeException("No existe la Persona"));
		
		personaExiste.setTipo_doc(per.getTipo_doc());
		personaExiste.setNombres(per.getNombres());
		personaExiste.setApellido(per.getApellido());
		personaExiste.setFec_nac(per.getFec_nac());
		personaExiste.setFec_registro(per.getFec_registro());
		personaExiste.setFoto(per.getFoto());
		personaExiste.setDireccion(per.getDireccion());
		
		personarepostory.save(personaExiste);
	
		return personaExiste;
	}
}