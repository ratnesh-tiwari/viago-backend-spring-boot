package com.viago.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "vehicles")
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "vehicle")
    private CaptainEntity captain;

    @ToString.Exclude
    @JoinColumn(name = "vehicle_type")
    @OneToOne(fetch = FetchType.EAGER)
    private VehicleTypeEntity vehicleType;

    @Column(name = "model")
    private String model;

    @Column(name = "license_Number")
    private String licenseNumber;

    @ToString.Exclude
    @JoinColumn(name = "current_location")
    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    private LocationEntity currentLocation;

    @Column(name = "passenger_capacity")
    private int passengerCapacity;

    @Column(name = "is_bady_transportable")
    private Boolean isBabyTransportable;

    @Column(name = "is_pet_transportable")
    private Boolean isPetTransportable;


}
