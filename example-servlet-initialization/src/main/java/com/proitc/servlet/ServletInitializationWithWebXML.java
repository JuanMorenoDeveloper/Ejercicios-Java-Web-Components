package com.proitc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Inicialización de servlet usando parametros de inicialización del web.xml
public class ServletInitializationWithWebXML extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private String param1;
	private String param2;

	@Override
	public void init() {

		param1 = this.getServletConfig().getInitParameter("param1");
		param2 = this.getInitParameter("param2");
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.print("ServletInitializationWithXML<br>" +
				"param1=" + param1 + "<br>param2=" + param2);
	}
}
