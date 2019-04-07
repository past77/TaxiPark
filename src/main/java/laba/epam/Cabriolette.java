package laba.epam;

public class Cabriolette extends Car {

    public Cabriolette(int speed, String brand, int price, int fuelConsumption, String color) {
        super(speed, brand, price, fuelConsumption, color);
        super.typeOfCar = "Cabriolette";
    }
}
