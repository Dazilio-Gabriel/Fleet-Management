package com.fleetcontrol.fleetmanagement.trucks.application;

import com.fleetcontrol.fleetmanagement.trucks.api.dto.TruckCreateRequest;
import com.fleetcontrol.fleetmanagement.trucks.domain.Truck;
import com.fleetcontrol.fleetmanagement.trucks.infrastructure.TruckRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

        //  Plate Validator
        String plateValidator = request.getPlate();
        if (plateValidator == null) {
            throw new IllegalArgumentException("erro para cadastrar truck (plate)");
        }
        plateValidator = plateValidator.trim();
        plateValidator = plateValidator.toUpperCase();
        plateValidator = plateValidator.replace("-", "");
        plateValidator = plateValidator.replace(" ", "");

        if (plateValidator.isEmpty()) {
            throw new IllegalArgumentException("erro para cadastrar truck (plate)");
        }
        request.setPlate(plateValidator);




        
        // TODO: revisar normalização de brand/model
// Atualmente removendo espaços e hífen, o que pode quebrar nomes reais (ex: "FH-16", "Actros MP4").
// Avaliar manter apenas trim() e, no máximo, padronizar uppercase.


        String brandValidator = request.getBrand();
        if (brandValidator == null) {
            throw new IllegalArgumentException("erro para cadastrar truck (brand)");
        }

        brandValidator = brandValidator.trim();
        brandValidator = brandValidator.toUpperCase();
        brandValidator = brandValidator.replace("-", "");
        brandValidator = brandValidator.replace(" ", "");

        if (brandValidator.isEmpty()) {
            throw new IllegalArgumentException("erro para cadastrar truck (brand)");
        }

        request.setBrand(brandValidator);

        String modelValidator = request.getModel();
        if (modelValidator == null) {
            throw new IllegalArgumentException("erro para cadastrar truck (model)");
        }
        modelValidator = modelValidator.trim();
        modelValidator = modelValidator.toUpperCase();
        modelValidator = modelValidator.replace("-", "");
        modelValidator = modelValidator.replace(" ", "");

        if (modelValidator.isEmpty()) {
            throw new IllegalArgumentException("erro para cadastrar truck (model)");
        }

        request.setModel(modelValidator);

        int validatorYear = request.getYear();
        int atualDateYear = LocalDate.now().getYear();

        if (validatorYear < 1900 || validatorYear > atualDateYear) {
            throw new IllegalArgumentException("erro para cadastrar truck (year)");
        }

        request.setYear(validatorYear);


        //capacity_Kg;


        //create {}
    }

}
