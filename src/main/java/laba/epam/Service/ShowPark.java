package laba.epam.Service;

import laba.epam.Car;

import java.util.ArrayList;


public class ShowPark extends ShowCar {

    static int allPrice;

    public void showTaxiPark(ArrayList<Car> car) {
        ArrayList<Car> cars = new ArrayList<Car>(car);
        System.out.println("Весь таксопарк: ");
        for (Car c : car) {
            showCar(c);
        }
        for (Car c : cars) {
            allPrice += c.getPrice();
        }
        calculatePrice(allPrice);
    }

    public int calculatePrice(int allPrice){
        System.out.println();
        System.out.printf("Цена автопарка: %d тис/$ \n", allPrice);
        return allPrice;
    }
}
