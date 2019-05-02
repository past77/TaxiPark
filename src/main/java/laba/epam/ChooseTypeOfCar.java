package laba.epam;

import laba.epam.Hierarchy.*;
import laba.epam.Service.Car;
import java.util.ArrayList;

public class ChooseTypeOfCar {
    private int typeOfCar;
    private int speed;
    private int price;
    private String brand;
    private String color;
    private int fuelConsumption;

    public static final int UNIVERSAL = 1;
    public static final int CUPE = 2;
    public static final int HATCHBACK = 3;
    public static final int CABRIOLETTE = 4;
    public static final int PICKUP = 5;

    public ArrayList<Car> newpark = new ArrayList<Car>();

       public void setChooseTypeOfCar(int typeOfCar, int speed, String brand, int price, int fuelConsumption, String color) {
        this.typeOfCar = typeOfCar;
        this.speed = speed;
        this.price = price;
        this.brand = brand;
        this.color = color;
        this.fuelConsumption = fuelConsumption;
        switch (typeOfCar) {
            case UNIVERSAL:
                newpark.add(new Universal (speed, brand, price, fuelConsumption, color));
                break;
            case CUPE:
                newpark.add(new Cupe(speed, brand, price, fuelConsumption, color));
                break;
            case HATCHBACK:
                newpark.add(new Hatchback(speed, brand, price, fuelConsumption, color));
                break;
            case CABRIOLETTE:
                newpark.add(new Cabriolette(speed, brand, price, fuelConsumption, color));
                break;
            case PICKUP:
                newpark.add(new Pikcup(speed, brand, price, fuelConsumption, color));
                break;
            default:
                throw new IllegalArgumentException("Invalid input");
        }
    }
    public ArrayList<Car> getNewpark() {
        return newpark;
    }
}