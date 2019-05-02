package laba.epam.Service;

import java.util.*;

public class AutoService extends ShowSortedCars {
    public void sortAllCars(ArrayList<Car> car) {
        ArrayList<Car> cars = new ArrayList<>(car);
        Collections.sort(cars, new FuelComparator());
        showSortCars(cars);
    }
}
class FuelComparator implements Comparator<Car> {
    @Override
    public int compare(Car a, Car b) {
        return a.getFuelConsumption() < b.getFuelConsumption() ? -1 : a.getFuelConsumption() == b.getFuelConsumption() ? 0 : 1;
    }
}
