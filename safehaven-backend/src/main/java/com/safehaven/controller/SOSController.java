package com.safehaven.controller;
@RestController
@RequestMapping("/api/sos")
@CrossOrigin("*")
public class SOSController {

    @Autowired
    private SOSService service;

    @PostMapping
    public SOS sendSOS(@RequestBody SOS sos) {
        return service.save(sos);
    }

    @GetMapping
    public List<SOS> getAll() {
        return service.getAll();
    }
}
