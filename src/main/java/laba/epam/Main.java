package laba.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        TaxiPark taxiPark = new TaxiPark();
        AutoService autoService = new AutoService();
        try {
            taxiPark.createPark();
        } catch (IOException e) {
            e.printStackTrace();
        }
        autoService.showTaxiPark(taxiPark.taxipark);
        System.out.println();
        autoService.sortAllCars(taxiPark.taxipark);
    }
}
