package com.viago.repository;

import com.viago.entities.CaptainEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaptainReviewRepository extends JpaRepository<CaptainEntity, Long> {
}
