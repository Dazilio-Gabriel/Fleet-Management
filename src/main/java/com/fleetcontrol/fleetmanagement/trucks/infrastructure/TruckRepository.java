package com.fleetcontrol.fleetmanagement.trucks.infrastructure;


import org.springframework.data.jpa.repository.JpaRepository;
import com.fleetcontrol.fleetmanagement.trucks.domain.Truck;

import java.util.Optional;

public interface TruckRepository extends JpaRepository<Truck, Long> {
    Optional<Truck> existsByPlate(String plate);

}
