package com.viago.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "captains")
public class CaptainEntity extends UserEntity{

    @ToString.Exclude
    @OneToMany(mappedBy = "captain", fetch = FetchType.LAZY)
    private Set<DocumentEntity> documents;

    @ToString.Exclude
    @OneToMany(mappedBy = "", fetch = FetchType.LAZY)
    private Set<RideEntity> rides;

    @JoinColumn(name = "vehicle_id")
    @OneToOne(fetch = FetchType.EAGER)
    private VehicleEntity vehicle;

    @Column(name = "is_captain_active")
    private boolean isCaptainActive;

}
