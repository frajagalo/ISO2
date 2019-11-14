package com.calatravaWare.ISO2.Modelo;

public class Box {

	/**
	 * Identificador único del box
	 */
	private int idBox;
	/**
	 * Taller al que pertenece el box
	 */
	private Taller Taller;
	/**
	 * Estado actual del box de los 9 estados posibles
	 */
	private Estado estado;
	/**
	 * Número de turno
	 */
	private int turno;

	public int getIdBox() {
		return this.idBox;
	}

	public Taller getTaller() {
		return this.Taller;
	}

	public void setTaller(Taller Taller) {
		this.Taller = Taller;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getTurno() {
		return this.turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

}