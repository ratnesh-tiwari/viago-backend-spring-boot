package com.viago.repository;

import com.viago.entities.DocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface DocumentRepository extends JpaRepository<DocumentEntity, Long> {
    Set<DocumentEntity> findAllByCaptainId(@Param("id") long captainId);
    long deleteAllByCaptainId(@Param("id") long captainId);
}
