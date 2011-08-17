package com.mySampleApplication.server;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.xml.DOMConfigurator;

/**
 * Handles log4j initialization by searching the classpath for a file named
 * log4j.xml
 *
 * @author bcall
 *
 */
public class LogInitializer implements ServletContextListener {

	public static final String LOG_CONFIG_FILENAME = "/log4j.xml";

	@Override
	public void contextDestroyed(ServletContextEvent e) {
	}

	@Override
	public void contextInitialized(ServletContextEvent e) {
		DOMConfigurator.configure(LogInitializer.class.getResource(LOG_CONFIG_FILENAME));
	}
}
