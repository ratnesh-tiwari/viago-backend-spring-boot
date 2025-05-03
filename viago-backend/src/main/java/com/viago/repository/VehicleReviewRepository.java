package com.viago.repository;

import com.viago.entities.RideEntity;
import com.viago.entities.VehicleEntity;
import com.viago.entities.VehicleReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface VehicleReviewRepository extends JpaRepository<VehicleReviewEntity, Long> {

    Set<VehicleReviewEntity> findByVehicle(@Param("vehicle")VehicleEntity vehicle);
    Set<VehicleReviewEntity> findByCurrentRide(@Param("currentRide") RideEntity ride);
}
