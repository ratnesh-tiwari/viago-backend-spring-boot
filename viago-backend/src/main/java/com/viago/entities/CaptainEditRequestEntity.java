package com.viago.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "driver_edit_requests")
public class CaptainEditRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "caption_id", nullable = false)
    private long captainId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Lob
    @Column(name = "profile_picture")
    private String profilePicture;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "is_reviewed")
    private boolean isReviewed;

    @Column(name = "is_approved")
    private boolean isApproved;

    @Column(name = "date_of_creation")
    private LocalDateTime dateOfCreation;
}
