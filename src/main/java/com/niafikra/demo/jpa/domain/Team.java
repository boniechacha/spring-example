package com.niafikra.demo.jpa.domain;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Set;


@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @NotBlank
    @Column(unique = true)
    private String name;

    @NotEmpty
    @OneToMany
    @Size(min = 5,max = 20)
    private Set<Student> students;
}
