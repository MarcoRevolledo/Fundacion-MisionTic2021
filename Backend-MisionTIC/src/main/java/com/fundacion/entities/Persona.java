package com.fundacion.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.File;

@Entity
@Table(name="personas")
public class Persona {
	
	@Column(nullable = false,unique = false)
	protected String tipo_doc;
	
	@Id
	@Column(nullable = false,unique = true)
	protected Integer doc;
	
	@Column(nullable = false,unique = false)
	protected String apellido;
	
	@Column(nullable = false,unique = false)
	protected String nombres;
	
	@Column(nullable = false,unique = false)
	protected Date fec_nac;
	
	@Column(nullable = false,unique = false)
	protected File foto;
	
	@Column(nullable = false, unique = false)
	protected String direccion;

	public Integer getDoc() {
		return doc;
	}

	public void setDoc(Integer doc) {
		this.doc = doc;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFec_nac() {
		return fec_nac;
	}

	public void setFec_nac(Date fec_nac) {
		this.fec_nac = fec_nac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public File getFoto() {
		return foto;
	}
	public void setFoto(File foto) {
		this.foto = foto;
	}
	public String getNombres()
}
