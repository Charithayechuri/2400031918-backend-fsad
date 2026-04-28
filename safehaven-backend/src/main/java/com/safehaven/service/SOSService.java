package com.safehaven.service;
@Service
public class SOSService {

    @Autowired
    private SOSRepository repo;

    public SOS save(SOS sos) {
        sos.setCreatedAt(LocalDateTime.now());
        return repo.save(sos);
    }

    public List<SOS> getAll() {
        return repo.findAll();
    }
}
