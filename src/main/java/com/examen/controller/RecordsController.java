package com.examen.controller;

import com.examen.utils.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UrlConstants.RECORDS)
public class RecordsController {

    @GetMapping("")
    public String goRecords(){
        return "records";
    }
}
