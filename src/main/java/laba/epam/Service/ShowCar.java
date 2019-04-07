package laba.epam.Service;

import laba.epam.Car;

public class ShowCar {

    public int showCar(Car car) {
        System.out.printf("%s, %s, %s,  Рас/топ: %d,   Цена: %s тис/$   Макс/с-ть: %d \n",
                car.getTypeOfCar(), car.getColor(), car.getBrand(), car.getFuelConsumption(), car.getPrice(), car.getSpeed());
        return car.getSpeed();
    }
}
