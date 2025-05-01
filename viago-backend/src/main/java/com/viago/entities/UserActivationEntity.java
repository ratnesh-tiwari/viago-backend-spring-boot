package com.viago.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "user_activations")
public class UserActivationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @Column(name = "minutes_valid")
    private int minutesValid;

    public boolean checkIfExpired() {
        LocalDateTime expiryTime = dateCreated.plusMinutes(minutesValid);
        return expiryTime.isBefore(LocalDateTime.now());
    }
}
