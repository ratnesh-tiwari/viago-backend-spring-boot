package com.viago.repository;

import com.viago.entities.FavoriteRideEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRideRepository extends JpaRepository<FavoriteRideEntity, Long> {
}
