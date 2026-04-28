package com.safehaven.controller;

import com.safehaven.model.Helpline;
import com.safehaven.repository.HelplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/helpline")
@CrossOrigin("*")
public class HelplineController {

    @Autowired
    private HelplineRepository repo;

    @GetMapping
    public List<Helpline> getAll() {
        return repo.findAll();
    }
}