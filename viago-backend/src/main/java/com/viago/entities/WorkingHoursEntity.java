package com.viago.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "working_hours")
public class WorkingHoursEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "shift_start", columnDefinition = "TIMESTAMP")
    private LocalDateTime shiftStart;

    @Column(name = "shift_end", columnDefinition = "TIMESTAMP")
    private LocalDateTime shiftEnd;

    @ToString.Exclude
    @JoinColumn(name = "captain_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CaptainEntity captain;
}
