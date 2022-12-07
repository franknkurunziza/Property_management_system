package com.example.Executive.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String password;
    private boolean isActive;
    private String roles;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="employee_id")
    private Employee employee;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="tenant_id")
    private Tenant tenant;

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


//  Getters and Setters...


}
