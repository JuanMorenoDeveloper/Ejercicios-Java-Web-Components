package com.proitc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servletWithListeners" },
name = "ServletWithListeners",
loadOnStartup = 1)
public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.print("ServletWithListeners<br>ServletContext InitParameters<br>");
		Enumeration<String> paramatersNames = getServletContext().getInitParameterNames();
		while (paramatersNames.hasMoreElements()) {
			String name = paramatersNames.nextElement();
			String value = getServletContext().getInitParameter(name);
			writer.println("name=" + name + ", value=" + value + "<br>");
		}
		writer.print("Session attributes<br>");
		Enumeration<String> attributeNames = request.getSession().getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			String name = attributeNames.nextElement();
			String value = request.getSession().getAttribute(name).toString();
			writer.println("name=" + name + ", value=" + value + "<br>");
		}
	}
}
