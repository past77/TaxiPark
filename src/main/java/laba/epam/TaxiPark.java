package laba.epam;

import laba.epam.Service.Car;
import laba.epam.Service.DefaultCars;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaxiPark {
    private int speed;
    private String brand;
    private int price;
    private int fuelConsumption;
    private String color;
    private int typeOfCar;

    DefaultCars defaultcars = new DefaultCars();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public ArrayList<Car> taxipark = new ArrayList<Car>();

    public void createPark() throws IOException {
        for (int i = 0;i < 100;i++) {
           // dafoultcars.addCar().forEach((c)-> taxipark.add(c));
            for (Car c: defaultcars.addCar()) {
                taxipark.add(c);
            }
            System.out.println("Do you wanna add a car? y/n");
            if ((reader.readLine()).equals("n")) {
                break;
            }
            System.out.println("Max size of TaxiPark are 100 cars. Now there are 4 cars. Add your car.");
            System.out.println("Input speed of a car: ");
            speed = Integer.parseInt(reader.readLine());
            if (speed <= 0 || speed > 380)
            {
                System.out.println("incorrect speed, enter new:");
                speed = Integer.parseInt(reader.readLine());
            }
            System.out.println("Input brand of a car: " );
            brand = reader.readLine();
            System.out.println("input price thousand/$: ");
            price = Integer.parseInt(reader.readLine());
            if (price <= 0)
            {
                System.out.println("Price is less or equal 0, enter new:");
                price = Integer.parseInt(reader.readLine());

            }
            System.out.println("Input fuel of consumption in litres for 100km: ");
            fuelConsumption = Integer.parseInt(reader.readLine());
            if (fuelConsumption <= 0 || fuelConsumption > 70)
            {
                System.out.println("incorrect input, enter new:");
                fuelConsumption = Integer.parseInt(reader.readLine());

            }
            System.out.println("Input color: ");
            color = reader.readLine();
            System.out.println("Input type of car. Univarsal - 1, Cupe - 2, HatchBack - 3, Cabriolette - 4, Pikcup - 5 ");
            typeOfCar = Integer.parseInt(reader.readLine());
            if (typeOfCar <= 0 || typeOfCar > 5)
            {
                System.out.println("incorrect input, enter new:");
                typeOfCar = Integer.parseInt(reader.readLine());
            }
             ChooseTypeOfCar choose = new ChooseTypeOfCar();
            choose.setChooseTypeOfCar(typeOfCar, speed, brand, price, fuelConsumption, color);
            for (Car c: choose.getNewpark()) {
                taxipark.add(c);
            }
            System.out.println("Do you wanna continue? y/n");
            if ((reader.readLine()).equals("n")){
                break;
            }
        }

    }
}
