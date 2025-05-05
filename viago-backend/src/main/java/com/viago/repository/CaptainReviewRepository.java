package com.viago.repository;

import com.viago.entities.CaptainEntity;
import com.viago.entities.CaptainReviewEntity;
import com.viago.entities.RideEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface CaptainReviewRepository extends JpaRepository<CaptainReviewEntity, Long> {

    Set<CaptainReviewEntity> findByCaptain(@Param("captain")CaptainEntity captain);
    Set<CaptainReviewEntity> findByCurrentRide(RideEntity currentRide);
}
