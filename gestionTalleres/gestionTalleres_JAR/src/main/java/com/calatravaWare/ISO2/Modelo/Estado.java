package com.calatravaWare.ISO2.Modelo;
/* Esta es la clase estado*/
public enum Estado {
	Libre,
	Reservada,
	Ocupada,
	Pidiendo,
	EnEspera,
	Servidos,
	Esperando,
	Pagando,
	EnPreparacion;

	/**
	 * Estado actual del box
	 */
	private String estadoBox;

}
