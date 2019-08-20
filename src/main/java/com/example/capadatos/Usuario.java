package com.example.capadatos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	//@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="cedula")
	private int cedula;
	
	@Column(name="nombre")
	private String nombre;
	
public Usuario(int id, int cedula, String nombre) {
	super();
	this.id = id;
	this.cedula = cedula;
	this.nombre = nombre;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getCedula() {
	return cedula;
}

public void setCedula(int cedula) {
	this.cedula = cedula;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
	
public Usuario() {
	
}

@Override
public String toString() {
	return "Usuario [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + "]";
}



}
