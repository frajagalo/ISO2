package com.calatravaWare.ISO2.Modelo;

public class Taller {

	/**
	 * Numero de identificación de la sucursal
	 */
	private int Sucursal;
	/**
	 * Dirección física de la sucursal del taller
	 */
	private String Direccion;
	/**
	 * Número de teléfono de la sucursal
	 */
	private int Telefono;

	public int getSucursal() {
		return this.Sucursal;
	}

	public void setSucursal(int Sucursal) {
		this.Sucursal = Sucursal;
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

}