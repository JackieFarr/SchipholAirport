import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AirportTest {

    Airport airport;
    Flight flight;
    Plane plane;

    @Before
    public void before(){
        airport = new Airport("JFK");
        plane = new Plane(PlaneType.AIRBUS800, "KLM");
        flight = new Flight(plane, 17, "Hawaii");
    }

    @Test
    public void getAirportCode(){
        assertEquals("JFK", airport.getAirportCode());
    }

    @Test
    public void airportCreatesFlight(){
        assertEquals(flight, airport.createFlight(plane, 17, "Hawaii"));
    }
}
