package com.viago.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.mapping.Join;

import java.time.LocalDateTime;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "emergency")
public class EmergencyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ToString.Exclude
    @JoinColumn(name = "user_id")
    @OneToOne(fetch = FetchType.EAGER)
    private UserEntity user;

    @ToString.Exclude
    @JoinColumn(name = "current_ride_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private RideEntity ride;

    @Column(name = "date_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime time;

    @Column(name = "reason")
    private String reason;
}
