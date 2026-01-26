package trucks.infrastructure;


import org.springframework.data.jpa.repository.JpaRepository;
import trucks.domain.Truck;

import java.util.Optional;

public interface TruckRepository extends JpaRepository<Truck, Long> {
    Optional<Truck> existsPlate(String plate);
    
}