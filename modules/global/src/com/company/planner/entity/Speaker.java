package com.company.planner.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Table(name = "PLANNER_SPEAKER")
@Entity(name = "planner_Speaker")
@NamePattern("%s %s|firstName, lastName")
public class Speaker extends StandardEntity {
    private static final long serialVersionUID = 6405448562278922979L;

    @NotNull
    @Column(name= "FIRST_NAME", nullable = false)
    private String firstName;


    @Column(name = "LAST_NAME")
    private String lastName;

    @NotNull
    @Email
    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}