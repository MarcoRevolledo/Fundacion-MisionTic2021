package com.fundacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundacion.entities.Padrino;

@Repository
public interface PadrinoRepository extends JpaRepository<Padrino, Integer>{

}
