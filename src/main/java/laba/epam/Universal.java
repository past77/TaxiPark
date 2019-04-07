package laba.epam;
import laba.epam.Car;

public class Universal extends Car {

    public Universal(int speed, String brand, int price, int fuelConsumption, String color) {
        super(speed, brand, price, fuelConsumption, color);
        super.typeOfCar = "Universal";
    }
}
