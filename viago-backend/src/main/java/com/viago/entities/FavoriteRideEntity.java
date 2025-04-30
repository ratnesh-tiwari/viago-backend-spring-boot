package com.viago.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "favorite_rides")
public class FavoriteRideEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "favorite_name")
    private String favoriteName;

    @ToString.Exclude
    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name = "favorite_locations",
            joinColumns = @JoinColumn(name = "favorite_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "route_id", referencedColumnName = "id")
    )
    private Set<RouteEntity> locations;

    @ToString.Exclude
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<PassengerEntity> passengers;

    @Column(name = "baby_transport")
    private boolean babyTransport;

    @Column(name = "pet_transport")
    private boolean petTransport;

    @Column(name = "ride_id")
    private int rideId;

    @ToString.Exclude
    @JoinColumn(name = "vehicle_type")
    @ManyToOne(fetch = FetchType.LAZY)
    private VehicleTypeEntity vehicleType;
}
