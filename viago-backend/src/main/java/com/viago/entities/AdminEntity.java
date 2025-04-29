package com.viago.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "admin")
@EqualsAndHashCode(callSuper = true)
public class AdminEntity extends UserEntity{
}
