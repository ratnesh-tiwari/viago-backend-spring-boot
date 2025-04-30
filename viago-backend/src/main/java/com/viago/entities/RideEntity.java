package com.viago.entities;

import com.viago.entities.enumerations.RideStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "rides")
public class RideEntity {

    private long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double totalCost;
    private CaptainEntity captain;
    private Set<PassengerEntity> passengers;
    private Set<RouteEntity> locations;
    private int estimatedTimeInMinutes;
    private Set<ReviewEntity> reviews;
    private RideStatus status;
    private RejectionEntity rejection;
    private Boolean isPanicPressed;
    private Boolean babyTransport;
    private Boolean petTransport;
    private VehicleTypeEntity vehicleType;
    private LocalDateTime scheduledTime;
}
