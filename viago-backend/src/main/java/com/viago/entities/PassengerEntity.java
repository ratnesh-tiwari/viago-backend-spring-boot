package com.viago.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

@Data
@Entity
@Table(name = "passengers")
@EqualsAndHashCode(callSuper = true)
public class PassengerEntity extends UserEntity{

    @ManyToMany()
    @ToString.Exclude
    @JoinTable(name= "passanger_ride",
            joinColumns = @JoinColumn(name = "passenger_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ride_id", referencedColumnName = "id")
    )
    private Set<RideEntity> rides;

    @ToString.Exclude
    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "passenger_favorite_ride",
            joinColumns = @JoinColumn(name = "passenger_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "favorite_ride_id", referencedColumnName = "id")
    )
    private Set<FavoriteRideEntity> favoriteRides;
}
