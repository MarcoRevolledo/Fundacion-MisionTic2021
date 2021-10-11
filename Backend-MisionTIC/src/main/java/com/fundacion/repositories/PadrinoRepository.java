package com.fundacion.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundacion.entities.Padrino;
import com.fundacion.entities.Persona;

@Repository
public interface PadrinoRepository extends JpaRepository<Padrino, Integer>{
	
	Optional<Padrino> findByPersona(Persona per);		
	
}
