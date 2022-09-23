package com.server.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long nik;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String address;

    private String country;

    private String gender;

    @Column(columnDefinition = "datetime")
    private String dateofbirth;

    public Employee() {
    }

    public Employee(Long nik, String name, String address, String country, String gender, String dateofbirth) {
        this.nik = nik;
        this.name = name;
        this.address = address;
        this.country = country;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
    }

    public Long getNik() {
        return nik;
    }

    public void setNik(Long nik) {
        this.nik = nik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

}