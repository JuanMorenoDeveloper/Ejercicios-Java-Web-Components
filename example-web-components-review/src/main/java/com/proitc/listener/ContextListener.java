package com.proitc.listener;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {

	private static final Logger log = Logger.getLogger(SessionListener.class.getName());

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}


}
