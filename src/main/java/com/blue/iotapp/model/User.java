package com.blue.iotapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
/* Creating a User entity and assigning it to a naming scheme
that will appear in the database. */
@Entity(name = "User")
@Table(name = "user")
public class User {
    //Variable Declaration
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surName;
    private String email;
    private String password;
    private Role role;
    //Creating relation between Users and Devices
    @ManyToMany
    private Set<Device> devices = new HashSet<>();
    //Default Empty Constructor
    public User() {
    }
    //Constructor
    public User(String name, String surName, String email, String password, Role role) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    //Getters and Setters
    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
