package com.ganesh.controller;

import com.ganesh.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportController {

    @Autowired
    private ReportService service;

    @GetMapping("/")
    public String indexPage(){
        return "index";
    }

}
