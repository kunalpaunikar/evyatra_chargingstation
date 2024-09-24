package com.example.PowerStation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargingStationService {
    @Autowired
    private ChargingStationRepository repository;

    public List<ChargingStation> findAll() {
        return repository.findAll();
    }

    public void save(ChargingStation station) {
        repository.save(station);
    }
}
