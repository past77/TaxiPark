package laba.epam.Service;
import laba.epam.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SearchCar extends ShowCar{
    
    public int speedMin;
    public int speedMax;
    public String speed;
    private int i = 0;
    private int j = 0;

    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
   public void searchCar(ArrayList<Car> car)  throws IOException {
       ArrayList<Car> cars = new ArrayList<Car>(car);
       System.out.println();
       System.out.println("Введите диапазон скорости для поиска машин (формат: 'min speed'-'max speed')");
       speed = read.readLine();
       String str = new String(speed);
       for (String retval : str.split("-")) {
           i++;
           if (i == 1)
               speedMin = Integer.parseInt(retval);
           else
               speedMax = Integer.parseInt(retval);
       }
       for (Car c: cars) {
           if (c.getSpeed() >= speedMin &&
                   c.getSpeed() <= speedMax) {
               j++;
               showCar(c);
           }
       }
       if(j == 0)
           System.out.println("Ничего не найдено");
   }
}
