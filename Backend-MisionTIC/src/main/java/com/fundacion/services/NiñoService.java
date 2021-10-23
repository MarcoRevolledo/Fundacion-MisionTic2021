package com.fundacion.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundacion.entities.Niño;
import com.fundacion.repositories.NiñoRepository;


@Service
public class NiñoService {
	
	@Autowired
	private NiñoRepository niñorepository;
	
	@Autowired
	private PersonaService persService;
	
	@Autowired
	private PadrinoService padriService;
	
	@Transactional
	public void AgregarNiño(Niño n) {
		niñorepository.save(n);
		//persService.AgregarPersona(n.getPersona());
	}
	@Transactional
	public void EliminarNiño(String doc) {
		niñorepository.delete(niñorepository.findByPersona(persService.BuscarPersonasById(doc))
				.orElseThrow(() -> new RuntimeException("No se encuentra el niño que se desea eliminar")));
		//persService.EliminarPersona(doc);
	}

	public List<Niño> ListarNiños() {
		return niñorepository.findAll();
	}

	public Niño BuscarNiñosByDoc(String doc) {
		Niño n= niñorepository.findByPersona(persService.BuscarPersonasById(doc)).orElseThrow(() -> new RuntimeException("No existe la padrino"));
		return n;
	}
	@Transactional
	public Niño EditarNiño(Niño n) {
		Niño niñoExiste = niñorepository.findByPersona(n.getPersona()).orElseThrow(()-> new RuntimeException("No se encontro un padrino con este documento"));
		niñoExiste.setAcudiente(n.getAcudiente());
		niñoExiste.setContacto_acudiente(n.getContacto_acudiente());
		niñoExiste.setPadrino(n.getPadrino());
		niñoExiste.setPersona(n.getPersona());
		niñorepository.save(niñoExiste);
		return niñoExiste;
	}
	
	@Transactional
	public Niño Apadrinar(Niño n, String doc) {
		Niño niñoExiste = niñorepository.findByPersona(n.getPersona()).orElseThrow(()-> new RuntimeException("No se encontro un padrino con este documento"));
		niñoExiste.setPadrino(padriService.BuscarpadrinosById(doc));
		niñorepository.save(niñoExiste);
		return niñoExiste;
	}
}
