package com.niafikra.demo.jpa.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "stdnt")
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    @Lob
    private String name;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

    private Long height;

    @OneToOne
    private Address address;

    public Student(String name, LocalDate dob, long height) {
        this.name = name;
        this.dateOfBirth = dob;
        this.height = height;
    }
}