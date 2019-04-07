package laba.epam;

import java.util.*;
import java.util.Collections;

public class AutoService {

    static long allPrice;
    
    public void showCar(Car car){
        System.out.printf("Кузов: %s, Расход топлива : %d, Марка: %s , Цена авто: %s тис/$  \n", car.typeOfCar,car.getFuelConsumption(),car.getBrand(), car.getPrice());
    }

    public void calculatePrice(long allPrice){
        System.out.printf("Цена автопаркат: %d тис/$ \n",allPrice);
    }
    public void showTaxiPark(ArrayList<Car> car) {
        ArrayList<Car> cars = new ArrayList<Car>(car);
        System.out.println("Весь таксопарк: ");
        for (Car cor : car) {
            showCar(cor);
        }
        for (Car cor : cars) {
            allPrice += cor.getPrice();
        }
        calculatePrice(allPrice);
    }
    public void showSortCars(ArrayList<Car> car){
        System.out.println("Посортированные по расходу топлива: ");
        for (Car c : car){
            showCar(c);
        }
    }
    public void sortAllCars(ArrayList<Car> car){
        ArrayList<Car> cars = new ArrayList<Car>(car);
        for(int i = 1; i < cars.size(); i++){
            if(cars.get(i - 1).getFuelConsumption() > cars.get(i).getFuelConsumption()){
                Car c = cars.get(i);
                cars.set(i, cars.get(i - 1));
                cars.set(i - 1, c);
                i = 0;
            }
        }
        showSortCars(cars);
    }
}
