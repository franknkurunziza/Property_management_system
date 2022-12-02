package com.example.Executive.model;

import javax.persistence.*;

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

    public int getRented_by() {
        return rented_by;
    }

    public void setRented_by(int rented_by) {
        this.rented_by = rented_by;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;
    private boolean is_Occupied;

    public Property() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProperty_address() {
        return Property_address;
    }

    public void setProperty_address(String property_address) {
        Property_address = property_address;
    }

    public double getRent_cost() {
        return rent_cost;
    }

    public void setRent_cost(double rent_cost) {
        this.rent_cost = rent_cost;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public int getRente_by() {
        return rented_by;
    }

    public void setRente_by(int rente_by) {
        this.rented_by = rente_by;
    }

    public boolean isIs_Occupied() {
        return is_Occupied;
    }

    public void setIs_Occupied(boolean is_Occupied) {
        this.is_Occupied = is_Occupied;
    }

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
