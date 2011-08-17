package com.mySampleApplication.client.services;


import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class Services {

	public static MySampleApplicationServiceAsync getAccountService() {
		MySampleApplicationServiceAsync service = (MySampleApplicationServiceAsync) GWT.create(MySampleApplicationService.class);

		// Server info
		ServiceDefTarget endpoint = (ServiceDefTarget) service;
		String moduleRelativeURL = GWT.getHostPageBaseURL() + "rpc/applicationService";
		endpoint.setServiceEntryPoint(moduleRelativeURL);
		return service;
	}

}
