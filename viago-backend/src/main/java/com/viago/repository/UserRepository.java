package com.viago.repository;

import com.viago.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("select u from UserEntity u where u.email = ?1 and u.password = ?2")
    UserEntity findByLogin(String email, String password);
    UserEntity findByEmail(String email);
}
