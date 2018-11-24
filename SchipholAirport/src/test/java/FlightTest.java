import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Plane plane;
    private Flight flight;


    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING200, "KLM");
        flight = new Flight(plane, 187, "New York");
    }

    @Test
    public void getPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void getFlightNum(){
        assertEquals(187, flight.getFlightNum());
    }

    @Test
    public void getDestination(){
        assertEquals("New York",flight.getDestination());
    }
}
