package laba.epam.Service;

import java.util.ArrayList;

public class ShowPark extends ShowCar {
    static int allPrice;

    public void showTaxiPark(ArrayList<Car> car) {
        ArrayList<Car> cars = new ArrayList<Car>(car);
        System.out.println("All taxipark: ");
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
        System.out.printf("Price of taxipark: %d th/$ \n", allPrice);
        return allPrice;
    }
}
