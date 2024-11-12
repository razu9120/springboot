package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.SampleService;

@RestController
@RequestMapping("sample")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping("/{str}")
    public String getString(@PathVariable String str) {
        return sampleService.getString(str);
    }
}
