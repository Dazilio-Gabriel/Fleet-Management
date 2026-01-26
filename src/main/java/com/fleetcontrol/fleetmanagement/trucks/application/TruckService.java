package com.fleetcontrol.fleetmanagement.trucks.application;

import com.fleetcontrol.fleetmanagement.trucks.domain.Truck;
import com.fleetcontrol.fleetmanagement.trucks.infrastructure.TruckRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckService {

    private TruckRepository truckRepository;

    public TruckService(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    public List<Truck> listAllTrucks() {
        return truckRepository.findAll();
    }

}