package laba.epam;

public class Cupe extends Car {
    public Cupe(int speed, String brand, int price, int fuelConsumption, String color) {
        super(speed, brand, price, fuelConsumption, color);
        super.typeOfCar = "Cupe";
    }
}
