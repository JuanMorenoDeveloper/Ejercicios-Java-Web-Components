package com.proitc.listener;

import java.util.logging.Logger;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionAttributeListener implements HttpSessionAttributeListener {

	private static final Logger log = Logger.getLogger(SessionListener.class.getName());

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		log.info("attributeAdded " + name + " " + value);
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		log.info("attributeRemoved " + name + " " + value);
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		log.info("attributeReplaced " + name + " " + value);
	}

}
