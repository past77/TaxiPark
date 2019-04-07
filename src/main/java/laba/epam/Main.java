package laba.epam;

import laba.epam.Service.AutoService;
import laba.epam.Service.SearchCar;
import laba.epam.Service.ShowPark;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        TaxiPark taxiPark = new TaxiPark();
        ShowPark parkshow = new ShowPark();
        AutoService autoService = new AutoService();
        SearchCar search = new SearchCar();
        try {
            taxiPark.createPark();
        } catch (IOException e) {
            e.printStackTrace();
        }
        parkshow.showTaxiPark(taxiPark.taxipark);
        System.out.println();
        autoService.sortAllCars(taxiPark.taxipark);
        search.searchCar(taxiPark.taxipark);
    }
}
