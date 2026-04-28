package com.safehaven.service;

import com.safehaven.model.SOS;
import com.safehaven.repository.SOSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SOSService {

    @Autowired
    private SOSRepository repo;

    public SOS saveSOS(SOS sos) {
        sos.setCreatedAt(LocalDateTime.now());
        return repo.save(sos);
    }

    public List<SOS> getAllSOS() {
        return repo.findAll();
    }
}