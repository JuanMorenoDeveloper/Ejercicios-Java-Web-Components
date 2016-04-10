package com.proitc.servlet;

import static java.util.Objects.nonNull;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/attributeScopesSender" },
name = "ServletAttributeScopesSender",
loadOnStartup = 1)
public class ServletAttributeScopesSender extends HttpServlet {
	private Logger log = Logger.getLogger(ServletAttributeScopesSender.class.getName());
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Enviando un objeto vía request scope
		request.setAttribute("attrib1", "value1");
		log.info("ServletAttributeScopesSender: Sending attrib1=" + request.getAttribute("attrib1"));
		// Enviando un valor vía HttpSession
		HttpSession session = request.getSession();
		if (nonNull(session)) {
			session.setAttribute("attrib2", "value2");
			log.info("ServletAttributeScopesSender: Sending attrib2=" + session.getAttribute("attrib2"));
		}
		// Enviando atributo vía application scope
		getServletContext().setAttribute("attrib3", "value3");
		log.info("ServletAttributeScopesSender: Sending attrib3=" + getServletContext().getAttribute("attrib3"));
		request.getRequestDispatcher("attributeScopesReceived").forward(request, response);
	}
}
