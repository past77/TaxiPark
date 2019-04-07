package laba.epam;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by ppolozhe on 4/4/19.
 */
public class TaxiParkTest{
    private TaxiPark taxi;

    @Before
    public void setUp() throws Exception {
        taxi = new TaxiPark();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNull() throws IOException {
        taxi.createPark();
    }

}