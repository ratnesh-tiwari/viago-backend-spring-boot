package com.viago.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "reviews")
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ToString.Exclude
    @JoinColumn(name = "reviewer_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private UserEntity reviewerId;

    @ToString.Exclude
    @JoinColumn(name = "current_ride")
    @ManyToOne(fetch = FetchType.LAZY)
    private RideEntity currentRide;

    @Column(name = "comment")
    private String comment;

    @Column(name = "rating")
    private byte rating;
}
