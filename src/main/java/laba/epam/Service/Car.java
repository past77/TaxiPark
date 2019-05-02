package laba.epam.Service;

import java.util.ArrayList;

public class Car {
    private int speed;
    private String brand;
    private int price;
    private int fuelConsumption;
    private String color;
    private String typeOfCar;

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }
    
    public String getTypeOfCar() {
        return typeOfCar;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0 || speed > 500)
            return ;
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
        if (price <= 0)
            return ;
        this.price = price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption <= 0 || fuelConsumption > 70)
            return ;
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
