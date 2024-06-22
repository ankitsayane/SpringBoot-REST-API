package com.auto.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "auto_vehicle")
@NoArgsConstructor
@Setter
@Getter
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vid;

    @NotBlank
    private String vname;

    @Enumerated(EnumType.STRING)
    private Company company;

    @NotBlank
    private String vnumber;

    @NotBlank
    private String vtype;

    @ManyToOne
    @JoinColumn(name = "uid", nullable = false)
    private User user;
}
