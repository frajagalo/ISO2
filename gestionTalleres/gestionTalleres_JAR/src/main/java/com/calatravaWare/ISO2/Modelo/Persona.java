package com.calatravaWare.ISO2.Modelo;

public class Persona {

	/**
	 * Número y letra del documento de identidad y/CIF
	 */
	private String DNI;
	/**
	 * Nombre
	 */
	private String Nombre;
	/**
	 * Apellidos
	 */
	private String Apellidos;
	/**
	 * Dirección de residencia o actividad comercial
	 */
	private String Direccion;
	/**
	 * Numero de teléfono
	 */
	private int Telefono;
	/**
	 * Número de cuenta
	 */
	private int IBAN;

	public String getDNI() {
		return this.DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getApellidos() {
		return this.Apellidos;
	}

	public void setApellidos(String Apellidos) {
		this.Apellidos = Apellidos;
	}

	public String getDireccion() {
		return this.Direccion;
	}

	public void setDireccion(String Direccion) {
		this.Direccion = Direccion;
	}

	public int getTelefono() {
		return this.Telefono;
	}

	public void setTelefono(int Telefono) {
		this.Telefono = Telefono;
	}

	public int getIBAN() {
		return this.IBAN;
	}

	public void setIBAN(int IBAN) {
		this.IBAN = IBAN;
	}

}