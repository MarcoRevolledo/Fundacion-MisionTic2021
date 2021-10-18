package com.fundacion.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ninos")
public class Niño {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_nino", nullable = false, unique = true)
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="doc_persona_fk", referencedColumnName = "doc_persona")
	private Persona persona;
	
	@Column(name="acudiente",nullable = false,unique = false)
	private String acudiente;
	
	@Column(name="contacto_acudiente",nullable = false,unique = false)
	private String contacto_acudiente;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name="id_padrino_fk", referencedColumnName = "id_padrino")
	private Padrino padrino;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getAcudiente() {
		return acudiente;
	}

	public void setAcudiente(String acudiente) {
		this.acudiente = acudiente;
	}

	public String getContacto_acudiente() {
		return contacto_acudiente;
	}

	public void setContacto_acudiente(String contacto_acudiente) {
		this.contacto_acudiente = contacto_acudiente;
	}

	public Padrino getPadrino() {
		return padrino;
	}

	public void setPadrino(Padrino padrino) {
		this.padrino = padrino;
	}
	
}