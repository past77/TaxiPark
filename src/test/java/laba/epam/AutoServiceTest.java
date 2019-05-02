package laba.epam;

import static org.junit.Assert.*;

import laba.epam.Service.Car;
import laba.epam.Service.AutoService;
import org.junit.Before;
import org.junit.Test;


public class AutoServiceTest{
    private AutoService autoService;

    @Before
    public void setUp() throws Exception {
        autoService = new AutoService();
    }


    @Test
    public void shouldReturnSpeed() {
        Car link = new Car(220, "Toyota", 30, 7, "green");
        assertEquals(220, link.getSpeed());
    }

    @Test
    public void shouldReturnColor() {
        Car link = new Car(220, "Toyota", 30, 7, "green");
        assertEquals("failure - strings are not equal", "green", link.getColor());
    }

}