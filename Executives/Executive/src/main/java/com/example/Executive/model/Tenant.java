package com.example.Executive.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
//import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    private String dob;
    private String SSN;
    private String Email;

    @Column(updatable = false)
    @DateTimeFormat(pattern="dd-mm-yyyy")
    private Date createdAt;
    @DateTimeFormat(pattern="dd-mm-yyyy")
    private Date updatedAt;

    //AUTOGEN CREATE/UPDATE TIMESTAMPS
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    //Relationship to user

    @OneToOne(mappedBy = "tenant", cascade = CascadeType.ALL)
    private User tenantUseracc;




}
