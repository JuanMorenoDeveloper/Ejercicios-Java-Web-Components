package com.proitc.listener;

import java.util.logging.Logger;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
	private static final Logger log = Logger.getLogger(SessionListener.class.getName());

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		log.info("Sesión creada");
		se.getSession().setAttribute("attrib4", "value4");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		log.info("Sesión destruida");
	}

}
