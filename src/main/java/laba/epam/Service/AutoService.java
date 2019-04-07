package laba.epam.Service;

import laba.epam.Car;

import java.util.*;

public class AutoService extends ShowSortedCars {

    ShowSortedCars sort = new ShowSortedCars();

    public void sortAllCars(ArrayList<Car> car) {
        ArrayList<Car> cars = new ArrayList<Car>(car);
        for (int i = 1; i < cars.size(); i++) {
            if (cars.get(i - 1).getFuelConsumption() > cars.get(i).getFuelConsumption()) {
                Car c = cars.get(i);
                cars.set(i, cars.get(i - 1));
                cars.set(i - 1, c);
                i = 0;
            }
        }
        showSortCars(cars);
    }
}
