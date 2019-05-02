package laba.epam.Service;

public class ShowCar {
    public int showCar(Car car) {
        System.out.printf("%s, %s, %s,  fuel: %d,   price: %s tho/$   Max speed: %d \n",
                car.getTypeOfCar(), car.getColor(), car.getBrand(), car.getFuelConsumption(), car.getPrice(), car.getSpeed());
        return car.getSpeed();
    }
}
