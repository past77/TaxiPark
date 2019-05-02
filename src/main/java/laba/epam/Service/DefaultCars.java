package laba.epam.Service;

import laba.epam.Hierarchy.Hatchback;
import laba.epam.Hierarchy.Pikcup;
import laba.epam.Hierarchy.Sedan;
import laba.epam.Hierarchy.Universal;

import java.util.ArrayList;

public class DefaultCars{
    public ArrayList<Car> dafaultcar = new ArrayList<Car>();

    public ArrayList<Car>  addCar() {
       dafaultcar.add(new Universal(220, "Toyota", 30, 7, "green"));
        dafaultcar.add(new Sedan(240, "Hundai", 40, 5, "white"));
        dafaultcar.add(new Hatchback(140, "Lada", 4, 11, "black"));
        dafaultcar.add(new Pikcup(240, "BMW", 42, 8, "yellow"));
        return dafaultcar;
    }
}
