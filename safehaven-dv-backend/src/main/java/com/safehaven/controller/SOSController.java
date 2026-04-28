package com.safehaven.controller;

import com.safehaven.model.SOS;
import com.safehaven.service.SOSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sos")
@CrossOrigin("*")
public class SOSController {

    @Autowired
    private SOSService service;

    @PostMapping
    public SOS sendSOS(@RequestBody SOS sos) {
        return service.saveSOS(sos);
    }

    @GetMapping
    public List<SOS> getAll() {
        return service.getAllSOS();
    }
}