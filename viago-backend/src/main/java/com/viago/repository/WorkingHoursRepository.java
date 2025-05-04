package com.viago.repository;

import com.viago.entities.WorkingHoursEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface WorkingHoursRepository extends JpaRepository<WorkingHoursEntity, Long> {
    Page<WorkingHoursEntity> findAllByCaptainId(@Param("id") long id, Pageable pageable);
    Page<WorkingHoursEntity> findAllByCaptainIdAndShiftStartIsAfterAndShiftEndIsBefore(@Param("id") long id, @Param("from")LocalDateTime start
            , @Param("to") LocalDateTime to, Pageable pageable);
    Page<WorkingHoursEntity> findAllByCaptainIdAndShiftEndIsBefore(@Param("id") long id, @Param("to") LocalDateTime to
            , Pageable pageable);
    Page<WorkingHoursEntity> findAllByCaptainIdAndShiftStartIsAfter(@Param("id") long id, @Param("from")LocalDateTime start
            , Pageable pageable);
}
