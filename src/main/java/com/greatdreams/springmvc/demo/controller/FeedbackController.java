package com.greatdreams.springmvc.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author greatdreams
 */

@Controller
public class FeedbackController {
    @RequestMapping(value="/feedback", method=RequestMethod.GET)
    public String feedbackForm(){
        return "feedback/form";
    }
    
    @RequestMapping(value="/feedback", method=RequestMethod.POST)
    public String feedbackResult(@RequestParam("username") String username, @RequestParam("comment") String comment) {
    	System.out.println(username);
    	System.out.println(comment);
        return "feedback/result";
    }
}
