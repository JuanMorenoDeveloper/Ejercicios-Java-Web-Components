package com.proitc.servlet;

import static java.util.Objects.nonNull;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/attributeScopesReceived" },
name = "ServletAttributeScopesReceived",
loadOnStartup = 1)
public class ServletAttributeScopesReceived extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		// Leyendo un valor vía request scope
		String attrib1 = (String) request.getAttribute("attrib1");
		// Leyendo un valor vía session
		String attrib2 = null;
		HttpSession session = request.getSession(false);
		if (nonNull(session)) {
			attrib2 = (String) session.getAttribute("attrib2");
		}
		// Leyendo atributo vía application scope
		String attrib3 = (String) getServletContext().getAttribute("attrib3");
		writer.print("ServletAttributeScopesReceived<br>" +
				"Received: attrib1=" + attrib1 + "<br>" +
				"Received: attrib2=" + attrib2 + "<br>" +
				"Received: attrib3=" + attrib3 + "<br>");
	}
}
