package com.proitc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/attributeScopesReceived" },
name = "ServletAttributeScopesReceived",
loadOnStartup = 1)
public class ServletAttributeScopesReceived extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String attrib1 = (String) request.getAttribute("attrib1");
		writer.print("ServletAttributeScopesReceived<br>" +
				"Received: attrib1=" + attrib1 + "<br>");
	}
}
