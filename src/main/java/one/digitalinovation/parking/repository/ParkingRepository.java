package one.digitalinovation.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.digitalinovation.parking.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
    
}
