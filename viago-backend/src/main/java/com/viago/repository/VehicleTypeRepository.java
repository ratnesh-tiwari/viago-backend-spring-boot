package com.viago.repository;

import com.viago.entities.VehicleTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface VehicleTypeRepository extends JpaRepository<VehicleTypeEntity, Long> {
    VehicleTypeEntity findByName(@Param("name") String name);
}
