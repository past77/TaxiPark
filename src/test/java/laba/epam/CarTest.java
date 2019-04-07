package laba.epam;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CarTest {
    private Car car;
    @Before
    public void setUp() throws Exception {
        car = new Car(200, "Mersedes", 20, 9, "white");
    }

    @Test
    public void testFuelShouldntBeLessThanZeroOrmoreThanSixty(){
       car.setFuelConsumption(0);
        int fuel = car.getFuelConsumption();
        assertNotSame ("incorrect input of fuel less",0, fuel);
    }

    @Test
    public void testFuelShouldntBeMoreThanSixty(){
        car.setFuelConsumption(99);
        int fuel = car.getFuelConsumption();
        assertNotSame ("incorrect input of fuel more",99, fuel);
    }
    @Test
    public void testSpeedShouldntBeLessThanZero(){
        car.setSpeed(-1);
        int speed = car.getSpeed();
        assertNotSame("incorrect input of speed less", -1, speed);
    }

    @Test
    public void testSpeedShouldntBeMoreThanFiveHundred() {
        car.setSpeed(555);
        int speed = car.getSpeed();
        assertNotSame("incorrect input of speed more", 555, speed);
    }
    @Test
    public void testPriceShouldntBeLessThanZero(){
        car.setPrice(-20);
        int price = car.getPrice();
        assertNotSame("incorrect input of price", -20, price);
    }

}