package com.everis.javaee.app.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name="Id")
    @NotBlank
    private String brand;
    @Column(name="Country")
    @NotBlank
    private String country;
    @Basic(optional = false)
    @Column(name = "Registration", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registration;
    @Basic(optional = false)
    @Column(name = "Created at", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;
    @Basic(optional = false)
    @Column(name = "Last updated", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @PastOrPresent
    private Date last_updated;

    public Car(){}

    public Car(UUID id, String brand, String country, Date registration, Date created_at, Date last_updated){
        this.id = id;
        this.brand = brand;
        this.country = country;
        this.registration = registration;
        this.created_at = created_at;
        this.last_updated = last_updated;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }
}
