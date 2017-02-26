package com.proitc.listener;

import java.util.logging.Logger;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener{
	private static final Logger log= Logger.getLogger(SessionListener.class.getName());
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		log.info("sessionCreated");
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		log.info("sessionDestroyed");
		
	}
}
