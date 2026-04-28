package com.safehaven.controller;

import com.safehaven.model.Complaint;
import com.safehaven.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin("*")
public class ComplaintController {

    @Autowired
    private ComplaintRepository repo;

    @PostMapping
    public Complaint create(@RequestBody Complaint complaint) {
        complaint.setStatus("PENDING");
        return repo.save(complaint);
    }

    @GetMapping
    public List<Complaint> getAll() {
        return repo.findAll();
    }
}