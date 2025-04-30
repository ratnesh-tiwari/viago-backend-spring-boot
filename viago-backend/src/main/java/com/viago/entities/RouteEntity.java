package com.viago.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "routes")
public class RouteEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @NotNull
    @ToString.Exclude
    @JoinColumn(name = "start_location_id")
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH})
    private LocationEntity departure;

    @NotNull
    @ToString.Exclude
    @JoinColumn(name = "end_location_id")
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH})
    private LocationEntity destination;

    @Column(name = "distance_in_km")
    private  double distanceInKm;
}
