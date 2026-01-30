package com.fleetcontrol.fleetmanagement.trucks.api.dto;

public class TruckUpdateRequest {
    private String plate;
    private String brand;
    private String model;
    private int year;
    private Integer capacity_Kg;


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

    public Integer getCapacity_Kg() {
        return capacity_Kg;
    }

    public void setCapacity_Kg(Integer capacity_Kg) {
        this.capacity_Kg = capacity_Kg;
    }

    @Override
    public String toString() {
        return "TruckUpdateRequest{" +
                "plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", capacity_Kg=" + capacity_Kg +
                '}';
    }
}
