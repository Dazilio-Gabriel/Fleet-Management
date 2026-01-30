package com.fleetcontrol.fleetmanagement.trucks.application;

import com.fleetcontrol.fleetmanagement.trucks.api.dto.TruckCreateRequest;
import com.fleetcontrol.fleetmanagement.trucks.domain.Truck;
import com.fleetcontrol.fleetmanagement.trucks.infrastructure.TruckRepository;
import org.springframework.stereotype.Service;

import javax.xml.validation.Validator;
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

    public void creatTruck(TruckCreateRequest request) {

        Truck truck = new Truck();

        request.getPlate();
        request.getModel();
        request.getYear();
        request.getCapacity_Kg();





        truckRepository.save(truck);
    }
}