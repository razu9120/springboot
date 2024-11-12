package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public String getString(String str) {
        return "Hello, " + str;
    }
}