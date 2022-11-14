package com.example.thympages.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String Email;

    @OneToMany(targetEntity = Property.class)
    private List<Property> propertyList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
