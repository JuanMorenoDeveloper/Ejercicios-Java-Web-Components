package com.proitc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servletFiltered" },
name = "ServletToFilter",
loadOnStartup = 1)
public class ServletFiltered extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.print("Filtered<br>Parameters<br>");
		Enumeration<String> params = request.getAttributeNames();
		while (params.hasMoreElements()) {
			String name = params.nextElement();
			String value = request.getAttribute(name).toString();
			writer.print("name=" + name + ", value=" + value+"<br>");
		}
	}
}
