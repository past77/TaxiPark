package laba.epam.Service;

import java.util.ArrayList;

public class ShowSortedCars extends ShowCar{
    public void showSortCars(ArrayList<Car> car) {
        System.out.println("Sorted car for fuel of consumption: ");
        for (Car c : car) {
            showCar(c);
        }
    }
}
