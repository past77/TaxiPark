package laba.epam;

public class Hatchback extends Car {

    public Hatchback(int speed, String brand, int price, int fuelConsumption, String color) {
        super(speed, brand, price, fuelConsumption, color);
        super.typeOfCar = "Hatchback";

    }
}
