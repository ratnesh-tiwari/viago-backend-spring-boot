package com.viago.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@Table(name = "captain_reviews")
@EqualsAndHashCode(callSuper = true)
public class CaptainReviewRequestEntity extends ReviewEntity {

    @ToString.Exclude
    @JoinColumn(name = "captain_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CaptainEntity captain;
}
