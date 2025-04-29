package com.viago.entities;

import com.viago.entities.enumerations.DocumentType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@ToString
@EqualsAndHashCode
@Table(name = "documents")
public class DocumentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)

    @Column(name = "document_type")
    private DocumentType documentType;

    @Lob
    @Column(name = "document_image")
    private String documentImage;

    @ToString.Exclude
    @JoinColumn(name = "captain_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CaptainEntity captainEntity;
}
