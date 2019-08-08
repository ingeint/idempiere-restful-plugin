package com.ingeint.ws;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;

public class CustomContextLoaderListener extends ContextLoaderListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
			super.contextInitialized(event);
		} finally {
			Thread.currentThread().setContextClassLoader(cl);
		}
	}

}