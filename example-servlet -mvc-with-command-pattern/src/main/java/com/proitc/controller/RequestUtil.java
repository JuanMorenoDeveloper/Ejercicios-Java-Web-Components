package com.proitc.controller;

import javax.servlet.http.HttpServletRequest;

/**
 * Clase utilitaria para obtener la acción
 */
public class RequestUtil {
	private HttpServletRequest request;

	public RequestUtil(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * Fabrica de acciones.
	 */
	public Action getAction() {
		Action action = null;
		String command = request.getParameter("accion");
		if (command.equals("creartest")) {
			action = new CrearTestAction();
		} else if (command.equals("default")) {
			action = new DefaultAction();
		}
		return action;
	}

}