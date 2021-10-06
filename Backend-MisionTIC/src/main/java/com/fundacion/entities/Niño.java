package com.fundacion.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="niño")
public class Niño extends Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_nino", nullable = false, unique = true)
	private Integer id; 
	
	@Column(name="acudiente", nullable = false, unique= false)
	private String acudiente;
	
	@Column(name="contacto", nullable = false, unique = false)
	private String contacto;
	
	@Column(name="fec_registro", nullable = false, unique= false)
	private Date fec_registro;

	public Integer getId() {
		return id;
	}

	public String getAcudiente() {
		return acudiente;
	}

	public void setAcudiente(String acudiente) {
		this.acudiente = acudiente;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public Date getFec_registro() {
		return fec_registro;
	}

	public void setFec_registro(Date fec_registro) {
		this.fec_registro = fec_registro;
	}
	
	
	

}
