package com.calatravaWare.ISO2.Modelo;

public class Cliente extends Persona {

	/**
	 * Marca y modelo del vehiculo del cliente
	 */
	private String Vehiculo;
	/**
	 * Matrícula del vehículo
	 */
	private String Matricula;

	public String getVehiculo() {
		return this.Vehiculo;
	}

	public void setVehiculo(String Vehiculo) {
		this.Vehiculo = Vehiculo;
	}

	public String getMatricula() {
		return this.Matricula;
	}

	public void setMatricula(String Matricula) {
		this.Matricula = Matricula;
	}
}