package com.proitc.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/attributeScopesSender" },
name = "ServletAttributeScopesSender",
loadOnStartup = 1)
public class ServletAttributeScopesSender extends HttpServlet {
	private Logger log = Logger.getLogger(ServletAttributeScopesSender.class.getName());
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("attrib1", "value1");
		log.info("ServletAttributeScopesSender: Sending attrib1=" + request.getAttribute("attrib1"));
		request.getRequestDispatcher("attributeScopesReceived").forward(request, response);
	}
}
