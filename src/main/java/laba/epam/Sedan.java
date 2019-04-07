package laba.epam;

public class Sedan extends Car {
    public Sedan(int speed, String brand, int price, int fuelConsumption, String color) {
        super(speed, brand, price, fuelConsumption, color);
        super.typeOfCar = "Sedan";
    }
}
