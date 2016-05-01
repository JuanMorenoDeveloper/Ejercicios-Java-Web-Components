package com.proitc.servlet;

import static java.util.Objects.nonNull;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/logout" },
name = "LogoutServlet",
loadOnStartup = 1)
public class LogoutServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processLogout(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processLogout(request, response);
	}

	public void processLogout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Obtener sesión
		HttpSession session = request.getSession(false);
		if (nonNull(session)) {
			session.invalidate();//No funciona en autenticación basic
		}
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Logout sucessfull");
	}
}
