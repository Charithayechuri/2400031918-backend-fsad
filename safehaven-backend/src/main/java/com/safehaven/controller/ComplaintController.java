package com.safehaven.controller;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin("*")
public class ComplaintController {

    @Autowired
    private ComplaintRepository repo;

    @PostMapping
    public Complaint create(@RequestBody Complaint complaint) {
        return repo.save(complaint);
    }

    @GetMapping
    public List<Complaint> getAll() {
        return repo.findAll();
    }
}