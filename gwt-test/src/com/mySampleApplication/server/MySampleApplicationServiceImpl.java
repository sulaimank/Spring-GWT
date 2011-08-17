package com.mySampleApplication.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.mySampleApplication.client.services.MySampleApplicationService;
import org.apache.log4j.Logger;

public class MySampleApplicationServiceImpl extends RemoteServiceServlet implements MySampleApplicationService {
    Logger logger = Logger.getLogger(MySampleApplicationServiceImpl.class);

    // Implementation of sample interface method
    public String getMessage(String msg) {
        logger.debug("********************* MySampleApplicationServiceImpl::getMessage() ***********************");
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!!!!!!\"";
    }
}