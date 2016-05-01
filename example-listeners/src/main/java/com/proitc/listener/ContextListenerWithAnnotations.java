package com.proitc.listener;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListenerWithAnnotations implements ServletContextListener {
	private static final Logger log = Logger.getLogger(ContextListenerWithAnnotations.class.getName());

	public ContextListenerWithAnnotations() {
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		log.info("Contexto inicializado");
		sce.getServletContext().setInitParameter("attrib1", "value1");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		log.info("Contexto destruido");
	}

}
