package com.viago.repository;

import com.viago.entities.UserActivationEntity;
import com.viago.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserActivationRepository extends JpaRepository<UserActivationEntity, Long> {
    UserActivationEntity findByUser(UserEntity user);
}
