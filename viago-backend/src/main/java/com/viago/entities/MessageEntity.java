package com.viago.entities;

import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "messages")
public class MessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ToString.Exclude
    @JoinColumn(name = "sender_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity sender;

    @ToString.Exclude
    @JoinColumn(name = "receiver_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity receiver;

    @Column(name = "message")
    private String message;

    @Column(name = "send_date_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime sendDateTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "message_type")
    private String messageType;

    @ToString.Exclude
    @JoinColumn(name = "ride_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private RideEntity ride;
}
