package com.viago.repository;

import com.viago.entities.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {
    VehicleEntity findByCaptainId(@Param("id") long id);
}
