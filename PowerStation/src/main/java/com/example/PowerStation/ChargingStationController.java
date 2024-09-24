package com.example.PowerStation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChargingStationController {
    @GetMapping("/stations")
    public String getStations() {
        return "stations"; // This should correspond to src/main/resources/templates/stations.html
    }
}

