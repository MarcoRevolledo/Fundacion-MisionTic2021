package com.fundacion.repositories;

import org.springframework.stereotype.Repository;
import com.fundacion.entities.Niño;
import com.fundacion.entities.Persona;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface NiñoRepository extends JpaRepository<Niño, Integer>{
	
	Optional<Niño> findByPersona(Persona persona);
		
}
