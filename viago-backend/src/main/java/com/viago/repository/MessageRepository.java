package com.viago.repository;

import com.viago.entities.MessageEntity;
import com.viago.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
    public Set<MessageEntity> findBySender(@Param("sender")UserEntity user);
}
