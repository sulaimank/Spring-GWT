package com.mySampleApplication.server.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MeterWorksController implements Controller  {


    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        if (loginService.isUserLoggedIn()) {
            ModelMap model = new ModelMap("currentUsername", "skarmali");
            return new ModelAndView("MySampleApplication", model);
//        } else {
//            return new ModelAndView("login");
//        }
    }
}
