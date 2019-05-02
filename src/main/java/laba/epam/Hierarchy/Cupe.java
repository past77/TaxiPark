package laba.epam.Hierarchy;

import laba.epam.Service.Car;

public class Cupe extends Car {
    public Cupe(int speed, String brand, int price, int fuelConsumption, String color) {
        super(speed, brand, price, fuelConsumption, color);
        super.setTypeOfCar("Cupe");
    }
}
