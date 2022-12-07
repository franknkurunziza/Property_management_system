package com.example.Executive.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String Property_address;
    private double rent_cost;
    private int owner;
    private int rented_by;
    private boolean is_Occupied;


    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", Property_address='" + Property_address + '\'' +
                ", rent_cost=" + rent_cost +
                ", owner=" + owner +
                ", rente_by=" + rented_by +
                ", is_Occupied=" + is_Occupied +
                '}';
    }
}
