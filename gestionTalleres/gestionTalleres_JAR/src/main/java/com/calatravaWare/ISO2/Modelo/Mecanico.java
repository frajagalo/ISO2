package com.calatravaWare.ISO2.Modelo;

 /*Esta es la clase mécanico*/
public class Mecanico extends Persona {

	private int boxAsignado;
	private JefeTaller JefeTaller;
	private Taller Taller;

	public int getBoxAsignado() {
		return this.boxAsignado;
	}

	public void setBoxAsignado(int boxAsignado) {
		this.boxAsignado = boxAsignado;
	}

	public JefeTaller getJefeTaller() {
		return this.JefeTaller;
	}

	public void setJefeTaller(JefeTaller JefeTaller) {
		this.JefeTaller = JefeTaller;
	}

	public Taller getTaller() {
		return this.Taller;
	}

	public void setTaller(Taller Taller) {
		this.Taller = Taller;
	}

}