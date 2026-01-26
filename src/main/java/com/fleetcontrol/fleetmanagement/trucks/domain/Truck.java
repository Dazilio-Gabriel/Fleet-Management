package com.fleetcontrol.fleetmanagement.trucks.domain;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "truck", schema = "fleet")
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "plate", nullable = false, unique = true)
    private String plate;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "year", nullable = false)
    private int year;

    @Column(name = "capacity_kg")
    private Integer capacity_kg;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private TruckStatus status;

    @Column(name = "sr_deleted", nullable = false)
    private boolean sr_deleted;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime created_at;

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updated_at;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getCapacity_kg() {
        return capacity_kg;
    }

    public void setCapacity_kg(Integer capacity_kg) {
        this.capacity_kg = capacity_kg;
    }

    public TruckStatus getStatus() {
        return status;
    }

    public void setStatus(TruckStatus status) {
        this.status = status;
    }

    public boolean isSr_deleted() {
        return sr_deleted;
    }

    public void setSr_deleted(boolean sr_deleted) {
        this.sr_deleted = sr_deleted;
    }

    public OffsetDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(OffsetDateTime created_at) {
        this.created_at = created_at;
    }

    public OffsetDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(OffsetDateTime updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Truck{" + "id=" + id + ", plate='" + plate + '\'' + ", brand='" + brand + '\'' + ", model='" + model + '\'' + ", year=" + year + ", capacity_kg=" + capacity_kg + ", status=" + status + ", sr_deleted=" + sr_deleted + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }
}
