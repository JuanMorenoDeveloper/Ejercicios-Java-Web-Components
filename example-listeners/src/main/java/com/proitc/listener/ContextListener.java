package com.proitc.listener;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {
	private static final Logger log = Logger.getLogger(ContextListener.class.getName());

	public ContextListener() {
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		log.info("Contexto inicializado");
		sce.getServletContext().setInitParameter("attrib3", "value3");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		log.info("Contexto destruido");
	}

}
