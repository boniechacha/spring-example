package com.niafikra.demo.jpa.domain;


import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class Teacher {

    @Id
    @Generated
    private Long id;

    private String name;

    private String subject;

    @OneToOne
    private Address address;

    @ManyToMany
    private Set<Student> students;
}
