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
	private String tipo_doc;
	
	@Id
	@Column(name="doc",nullable = false,unique = true)
	private String doc;
	
	@Column(name="apellido",nullable = false,unique = false)
	private String apellido;
	
	@Column(name="nombres",nullable = false,unique = false)
	private String nombres;
	
	@Column(name="fec_nac",nullable = false,unique = false)
	private Date fec_nac;
	
	@Column(name="foto",nullable = false,unique = false)
	private File foto;
	
	@Column(name="direccion",nullable = false, unique = false)
	private String direccion;
	
	@Column(name="fec_registro",nullable = false, unique = false)
	private String fec_registro;
	
	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
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

	public String getFec_registro() {
		return fec_registro;
	}

	public void setFec_registro(String fec_registro) {
		this.fec_registro = fec_registro;
	}
}
