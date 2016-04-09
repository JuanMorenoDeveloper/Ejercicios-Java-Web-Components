package com.proitc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Ejemplo de implementación del command pattern
 */
public class DefaultAction implements Action {
	@Override
	public String performAction(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		return "default";
	}
}
