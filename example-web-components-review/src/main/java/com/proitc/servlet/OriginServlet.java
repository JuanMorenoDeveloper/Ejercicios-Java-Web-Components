package com.proitc.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity.EmptyRoleSemantic;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@HttpConstraint(value = EmptyRoleSemantic.PERMIT)
public class OriginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(OriginServlet.class.getName());

	@PostConstruct
	public void postConstruct() {
		log.info("Post Construct servlet");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		log.info("Init servlet");
		super.init(config);
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/dest/Destination");
		HttpSession session = request.getSession();
		log.info("Time session "+(session.getLastAccessedTime()-session.getCreationTime()));
		session.invalidate();
		session = request.getSession();
		
		response.addHeader("X-Retries", "4");
		response.addCookie(new Cookie("pet", "joe"));
		session.setAttribute("test", "test");
		session.setAttribute("test", "test1");
		session.removeAttribute("test");
		dispatcher.forward(request, response);
	}
}
