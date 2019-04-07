package laba.epam;

public class Pikcup extends Car{

    public Pikcup(int speed, String brand, int price, int fuelConsumption, String color) {
        super(speed, brand, price, fuelConsumption, color);
        super.typeOfCar = "Pickup";
    }
}
