package com.example.logging.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory; //API for logBack
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 
 * https://www.baeldung.com/spring-boot-logging
 *
 */

@Controller
public class LoggingController {
	
	/**
	 * Springboot dùng slf4j API làm common-logging
	 * Mặc định dùng Logback để tạo log.
	 * LogBack đc tomcat và jetty
	 */
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingController.class);
    

    @RequestMapping(path = "/")
    public String home(Model model) {
 
        LOGGER.trace("This is TRACE"); //code này ko hiển thị vì log level  ở file Log4j2.xml
        LOGGER.debug("This is DEBUG "); //code này ko hiển thị vì log level  ở file Log4j2.xml
        LOGGER.info("This is INFO");
        LOGGER.warn("This is WARN");
        LOGGER.error("This is ERROR");
 
        return "index";
    }



}