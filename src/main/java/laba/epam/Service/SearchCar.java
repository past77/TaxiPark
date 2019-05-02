package laba.epam.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SearchCar extends ShowCar{
    public int speedMin;
    public int speedMax;
    public String speed;
    private int i = 0;
    private int isCar = 0;

    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
   public void searchCar(ArrayList<Car> car)  throws IOException {
       ArrayList<Car> cars = new ArrayList<Car>(car);
       System.out.println();
       System.out.println("Input range of speed for search cars (format: 'min speed'-'max speed')");
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
               isCar++;
               showCar(c);
           }
       }
       if(isCar == 0)
           System.out.println("Nothing found");
   }
}
