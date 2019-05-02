package laba.epam.Hierarchy;

import laba.epam.Service.Car;

public class Sedan extends Car {
    public Sedan(int speed, String brand, int price, int fuelConsumption, String color) {
        super(speed, brand, price, fuelConsumption, color);
        super.setTypeOfCar("Sedan");
    }
}
