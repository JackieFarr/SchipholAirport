import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class AirportTest {

    Airport airport;
    Flight flight;
    Plane plane;
    Departures departures;

    @Before
    public void before() {
        airport = new Airport("JFK");
        plane = new Plane(PlaneType.AIRBUS800, "KLM");
        flight = new Flight(plane, 17, "Hawaii");
        departures = new Departures();
    }

    @Test
    public void getAirportCode() {
        assertEquals("JFK", airport.getAirportCode());
    }

    @Test
    public void getDepartures() {
        assertEquals(0, airport.getDepartures().size());
    }

    @Test
    public void createFlights() {
        airport.createFlight(plane, 17, "Hawaii");
        airport.createFlight(plane, 17, "Hawaii");
        assertEquals(2, airport.getDepartures().size());
    }

    @Test
    public void addPlaneToHangar(){
        airport.addPlaneToHangar(plane, airport.getHangar());
        assertEquals(1, airport.getHangar().size());
    }

}