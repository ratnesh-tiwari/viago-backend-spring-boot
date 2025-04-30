package com.viago.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "rejections")
public class RejectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ToString.Exclude
    @JoinColumn(name = "ride_id")
    @OneToOne(fetch = FetchType.LAZY)
    private RideEntity ride;

    @Column(name = "reason")
    private String reason;

    @ToString.Exclude
    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity user;

    @Column(name = "time_of_rejection")
    private LocalDateTime timeOfRejection;
}
