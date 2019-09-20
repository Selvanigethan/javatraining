package com.example.smsui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UIController {

    @RequestMapping(value = "/ss")
    public String loadhome(){

        return "home";

    }


}
