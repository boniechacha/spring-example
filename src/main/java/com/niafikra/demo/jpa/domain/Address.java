package com.niafikra.demo.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String region;
    private String district;
    private String street;
    private int houseNumber;

}
