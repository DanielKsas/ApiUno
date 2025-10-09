package com.example.ApIuno.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity



public class Usuario {

@Id
@GeneratedValue(strategy =
GenerationType.IDENTITY)
    private Integer id;
@Column(length = 50, nullable = false)
    private String fullName;
    private LocalDate birthDate;
    private String email;
    private  String password;
    private  String country;
    private  String state;



    public Usuario(Integer id, String name, LocalDate birthDate, String email, String password, String country, String state) {
        this.id = id;
        this.fullName = name;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        this.country = country;
        this.state = state;
    }

    public Usuario() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }
}
