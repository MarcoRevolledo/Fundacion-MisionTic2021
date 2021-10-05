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
	
	@Column(name="tipo_doc",nullable = false,unique = false)
	protected String tipo_doc;
	
	@Id
	@Column(name="doc",nullable = false,unique = true)
	protected Integer doc;
	
	@Column(name="apellido",nullable = false,unique = false)
	protected String apellido;
	
	@Column(name="nombres",nullable = false,unique = false)
	protected String nombres;
	
	@Column(name="fec_nac",nullable = false,unique = false)
	protected Date fec_nac;
	
	@Column(name="foto",nullable = false,unique = false)
	protected File foto;
	
	@Column(name="direccion",nullable = false, unique = false)
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
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}
	 public String getTipo_doc() {
	     return tipo_doc; 	 
	 }
}
