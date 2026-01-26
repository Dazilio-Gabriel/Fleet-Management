package com.fleetcontrol.fleetmanagement.trucks.api;

import com.fleetcontrol.fleetmanagement.trucks.application.TruckService;
import com.fleetcontrol.fleetmanagement.trucks.domain.Truck;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trucks")
public class TruckController {

    TruckService truckService;

    public TruckController(TruckService truckService) {
        this.truckService = truckService;
    }

    @GetMapping
    public List<Truck> getTrucks() {
        return truckService.listAllTrucks();
    }


}

