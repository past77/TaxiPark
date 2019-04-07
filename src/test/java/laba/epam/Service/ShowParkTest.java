package laba.epam.Service;

import laba.epam.Car;
import laba.epam.Hierarchy.Universal;
import laba.epam.TaxiPark;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShowParkTest {

    public ArrayList<Car> taxipark = new ArrayList<Car>();
    private AutoService autoService;

    private ShowPark show;

    @Before
    public void setUp() throws Exception {
        show = new ShowPark();
        autoService = new AutoService();
    }

    @Test
    public void testAssertNotNull() {
        assertNull("should be null", null);
    }

    @Test
    public void testAssertsame() {
        int i = show.calculatePrice(6);
        assertEquals(6, i);
    }

}