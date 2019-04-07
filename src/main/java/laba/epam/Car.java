package laba.epam;

import java.util.ArrayList;

public class Car {
    private int speed;
    private String brand;
    private int price;
    private int fuelConsumption;
    private String color;
    protected String typeOfCar;

    public String getTypeOfCar() {
        return typeOfCar;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Car(int speed, String brand, int price, int fuelConsumption, String color) {
        this.speed = speed;
        this.brand = brand;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.color = color;
    }

}
