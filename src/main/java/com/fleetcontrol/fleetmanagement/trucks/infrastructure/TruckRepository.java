package com.fleetcontrol.fleetmanagement.trucks.infrastructure;


import org.springframework.data.jpa.repository.JpaRepository;
import com.fleetcontrol.fleetmanagement.trucks.domain.Truck;

public interface TruckRepository extends JpaRepository<Truck, Long> {

}