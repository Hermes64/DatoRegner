package com.example.demo.controllers;


import com.example.demo.services.DatoRegner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Date;

@Controller
public class MyController {

    @GetMapping("/tal")
    @ResponseBody
    public int skrivTal() {
        return 100;
    }

    @GetMapping("/date")
    @ResponseBody
    public Long echo() throws ParseException {
        DatoRegner dr = new DatoRegner();
        return dr.beregning();
    }


}
