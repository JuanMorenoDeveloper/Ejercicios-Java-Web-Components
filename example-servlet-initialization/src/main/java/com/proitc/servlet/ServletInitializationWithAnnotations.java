package com.proitc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Inicialización de servlet usando anotaciones
@WebServlet(urlPatterns = { "/withanotations" },
name = "ServletInitializationWithAnnotations",
initParams = { @WebInitParam(name = "param1", value = "value1", description = "Param 1 test"),
		@WebInitParam(name = "param2", value = "value2", description = "Param 2 test") },
loadOnStartup = 1)
public class ServletInitializationWithAnnotations extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private String param1;
	private String param2;

	@Override
	public void init() {
		param1 = this.getInitParameter("param1");
		param2 = this.getInitParameter("param2");
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.print("ServletInitializationWithAnnotations<br>" +
				"param1=" + param1 + "<br>param2=" + param2);
	}
}
