package com.proitc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String param = (String) request.getAttribute("newAttribute");
		String xRetries = response.getHeader("X-Retries");
		int xRet = request.getIntHeader("X-Retries");
		Cookie[] cookies = request.getCookies();
		PrintWriter writer = response.getWriter();
		for (Cookie cookie : cookies) {
			writer.write("<br>" + cookie.getName() + " " + cookie.getValue());
		}
		writer.write("<br>XRetries: " + xRetries);
		writer.write("<br>XRetries=" + xRet);
		writer.write("<br>El valor de newAttribute es " + param);
		writer.write("<br>ForwardURI=" + request.getRequestURI());
	}
}
