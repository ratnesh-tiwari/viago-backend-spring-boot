package com.viago.repository;

import com.viago.entities.CaptainEditRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaptainEditRequestRepository extends JpaRepository<CaptainEditRequestEntity, Long> {
    CaptainEditRequestEntity findByCaptainId(long captainId);
}
