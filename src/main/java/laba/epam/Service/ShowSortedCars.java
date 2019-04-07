package laba.epam.Service;

import laba.epam.Car;

import java.util.ArrayList;


public class ShowSortedCars extends ShowCar{

    public void showSortCars(ArrayList<Car> car) {
        System.out.println("Посортированные по расходу топлива: ");
        for (Car c : car) {
            showCar(c);
        }
    }
}
