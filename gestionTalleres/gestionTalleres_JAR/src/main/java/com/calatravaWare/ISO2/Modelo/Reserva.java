package com.calatravaWare.ISO2.Modelo;

public class Reserva {

	/**
	 * Número de identificación de la reparación
	 */
	private String idReparacion;
	/**
	 * Box asignado a la reparación
	 */
	private Box Box;
	/**
	 * Mecánico asignado a la reparación
	 */
	private Mecanico Mecanico;
	/**
	 * Cliente que ha solicitado la reparación
	 */
	private Cliente Cliente;
	/**
	 * Fecha de la cita
	 */
	private int fechaReparacion;
	/**
	 * Es la fecha de la reparación más 20 minutos de cortesía
	 */
	private int fechaFinReserva;
	/**
	 * Hora a la que comienza la reparación (HH:MM)
	 */
	private int horaInicio;
	/**
	 * Hora a la que finaliza la reparación (HH:MM)
	 */
	private int horaFin;

	public String getIdReparacion() {
		return this.idReparacion;
	}

	public void setIdReparacion(String idReparacion) {
		this.idReparacion = idReparacion;
	}

	public Box getBox() {
		return this.Box;
	}

	public void setBox(Box Box) {
		this.Box = Box;
	}

	public Mecanico getMecanico() {
		return this.Mecanico;
	}

	public void setMecanico(Mecanico Mecanico) {
		this.Mecanico = Mecanico;
	}

	public Cliente getCliente() {
		return this.Cliente;
	}

	public void setCliente(Cliente Cliente) {
		this.Cliente = Cliente;
	}

	public int getFechaReparacion() {
		return this.fechaReparacion;
	}

	public void setFechaReparacion(int fechaReparacion) {
		this.fechaReparacion = fechaReparacion;
	}

	public int getFechaFinReserva() {
		return this.fechaFinReserva;
	}

	public void setFechaFinReserva(int fechaFinReserva) {
		this.fechaFinReserva = fechaFinReserva;
	}

	public int getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}

	public int calcularTiempo() {
		// TODO - implement Reserva.calcularTiempo
		throw new UnsupportedOperationException();
	}

	/**
	 * Realiza una solicitud de reserva. Si se realiza con éxito devuelve un 1
	 */
	public int hacerReserva() {
		// TODO - implement Reserva.hacerReserva
		throw new UnsupportedOperationException();
	}

}