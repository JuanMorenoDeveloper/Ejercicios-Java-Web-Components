package com.proitc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "*.do" })
public class FrontControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// Inicialización del servlet
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	// Destrucción del servlet
	@Override
	public void destroy() {
	}

	/**
	 * Procesamiento de peticiones HTTP <code>GET</code> y <code>POST</code>
	 * 
	 * @param request
	 *            request del servlet
	 * @param response
	 *            response del servlet
	 * @throws IOException
	 * @throws ServletException
	 **/
	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paginaDestino = null;
		// Lectura de acciones
		String accion = request.getParameter("accion");
		if (accion.equals("creartest")) {
			paginaDestino = "crearTest.jsp";
		} else {
			paginaDestino = "default.jsp";
		}
		navegar(request, response, paginaDestino);
	}

	/**
	 * Redirecciona a página específica la solicitud
	 * 
	 * @throws IOException
	 * @throws ServletException
	 * @param request
	 * @param response
	 * @param paginaDestino
	 **/
	public void navegar(HttpServletRequest request, HttpServletResponse response, String paginaDestino)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/" + paginaDestino);
		dispatcher.forward(request, response);
	}

	/**
	 * Información del servlet
	 **/
	@Override
	public String getServletInfo() {
		return "FrontControllerServlet";
	}

	/**
	 * Método HTTP <code>GET</code>
	 **/
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Método HTTP <code>POST</code>
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
}
