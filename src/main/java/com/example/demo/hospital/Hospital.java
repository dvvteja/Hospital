package com.example.demo.hospital;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Hospital {
    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String city;
    @Column
    private double rating;
    public Hospital() {
    }
    public Hospital(int id, String name, String city, double rating) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void add() {
    }
}


