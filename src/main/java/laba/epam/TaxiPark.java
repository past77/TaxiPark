package laba.epam;

import laba.epam.Hierarchy.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.System.exit;

public class TaxiPark {
    private int speed;
    private String brand;
    private int price;
    private int fuelConsumption;
    private String color;
    private int typeOfCar;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public ArrayList<Car> taxipark = new ArrayList<Car>();

    public void addCarToPark(Car car){
        taxipark.add(car);
    }
    public void createPark() throws IOException {
        for (int i = 0;i < 100;i++) {
            addCarToPark(new Universal(220, "Toyota", 30, 7, "green"));
            addCarToPark(new Sedan(240, "Hundai", 40, 5, "white"));
            addCarToPark(new Hatchback(140, "Lada", 4, 11, "black"));
            addCarToPark(new Pikcup(240, "BMW", 42, 8, "yellow"));
            System.out.println("Хотите додать авто? y/n");
            if ((reader.readLine()).equals("n")) {
                break;
            }
            System.out.println("Розмерность таксопарка 100 машин, занято 4 места, Добавьте свое авто.");
            System.out.println("Введите скорость авто: ");
            speed = Integer.parseInt(reader.readLine());
            if (speed <= 0 || speed > 380)
            {
                System.out.println("Некорректная скорость, пжл, введите новую:");
                speed = Integer.parseInt(reader.readLine());
            }
            System.out.println("Введите марку авто: " );
            brand = reader.readLine();
            System.out.println("Введите цену в тис/$: ");
            price = Integer.parseInt(reader.readLine());
            if (price <= 0)
            {
                System.out.println("Цена менше или равно 0, пжл, введите другую:");
                price = Integer.parseInt(reader.readLine());

            }
            System.out.println("Введите расход топлива на 100км: ");
            fuelConsumption = Integer.parseInt(reader.readLine());
            if (fuelConsumption <= 0 || fuelConsumption > 70)
            {
                System.out.println("Некорректный ввод, пжл, введите новый::");
                fuelConsumption = Integer.parseInt(reader.readLine());

            }
            System.out.println("Введите цвет: ");
            color = reader.readLine();
            System.out.println("Введите тип кузова. Univarsal - 1, Cupe - 2, HatchBack - 3, Cabriolette - 4, Pikcup - 5 ");
            typeOfCar = Integer.parseInt(reader.readLine());

            switch (typeOfCar) {
                case 1:
                    addCarToPark(new Universal(speed, brand, price, fuelConsumption, color));
                    break;
                case 2:
                    addCarToPark(new Cupe(speed, brand, price, fuelConsumption, color));
                    break;
                case 3:
                    addCarToPark(new Hatchback(speed, brand, price, fuelConsumption, color));
                    break;
                case 4:
                    addCarToPark(new Cabriolette(speed, brand, price, fuelConsumption, color));
                    break;
                case 5:
                    addCarToPark(new Pikcup(speed, brand, price, fuelConsumption, color));
                    break;
                default:
                    break;
            }
            System.out.println("Продолжить ввод авто? y/n");
            if ((reader.readLine()).equals("n")){
                break;
            }
        }

    }
}
