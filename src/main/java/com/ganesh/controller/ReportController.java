package com.ganesh.controller;

import com.ganesh.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReportController {

    @Autowired
    private ReportService service;


}
