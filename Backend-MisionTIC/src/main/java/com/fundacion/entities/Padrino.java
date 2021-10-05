package com.fundacion.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Padrino extends Usuario{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_padrino", nullable = false, unique = true)
	private Integer id;
	
	@Column(name="ciudad_res", nullable = false, unique = false)
	private String ciudad_res;
	
	@Column(name="telefono", nullable = false, unique = false)
	private String telefono;
}
