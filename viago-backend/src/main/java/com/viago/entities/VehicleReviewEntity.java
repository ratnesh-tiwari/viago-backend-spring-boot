package com.viago.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@Table(name = "vehicle_reviews")
@EqualsAndHashCode(callSuper = true)
public class VehicleReviewEntity extends ReviewEntity{

    @ToString.Exclude
    @JoinColumn(name = "vehicle_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private VehicleEntity vehicle;
}
