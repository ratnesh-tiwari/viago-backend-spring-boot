package com.viago.repository;

import com.viago.entities.CaptainReviewRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaptainEditRequestRepository extends JpaRepository<CaptainReviewRequestEntity, Long> {
}
