package com.spring.springData.springDataJpaTest.service;

public class Tyre {
    private String brand;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return " is working..." ;
    }
}