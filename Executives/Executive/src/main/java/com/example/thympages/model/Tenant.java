package com.example.thympages.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Tenants")
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)

    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDateTime dob;
    private String SSN;
    private String Email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
