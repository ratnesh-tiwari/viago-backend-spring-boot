package com.viago.repository;

import com.viago.entities.CaptainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.Set;

public interface CaptainRepository extends JpaRepository<CaptainEntity, Long> {

    Optional<CaptainEntity> findCaptainByVehicleId(@Param("id") long vehicleId);
    Set<CaptainEntity> findAllCaptainByIsCaptainActiveTrue();
}
