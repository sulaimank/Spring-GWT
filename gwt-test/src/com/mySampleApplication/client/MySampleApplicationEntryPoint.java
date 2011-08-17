package com.mySampleApplication.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import java.util.logging.Logger;


/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class MySampleApplicationEntryPoint implements EntryPoint {

    private Logger logger = Logger.getLogger("MySampleApplicationEntryPoint");

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        logger.info("***************** Inside onModuleLoad() ***************************");
        RootPanel.get("contentPanel").add(new MySampleView());
    }
}
