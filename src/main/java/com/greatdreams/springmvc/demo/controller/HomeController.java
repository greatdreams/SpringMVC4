package com.greatdreams.springmvc.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author greatdreams
 */
@Controller
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    @RequestMapping(value = {"/index.html","/"})
    public String home(){
       logger.info("calling home()");
       logger.info("return 'index'");
        return "index";
    }
    
    @RequestMapping("/feedback.html") 
    public String feedback(){
        return "feedback";
    }
}
