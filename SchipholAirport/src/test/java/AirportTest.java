import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class AirportTest {

    Airport airport;
    Flight flight;
    Plane plane;
    Departures departures;
    Passenger passenger;
    Passenger passenger2;
    ArrayList passengersBooked;

    @Before
    public void before() {
        airport = new Airport("JFK");
        plane = new Plane(PlaneType.AIRBUS800, "KLM");
        flight = new Flight(plane, 17, "Hawaii");
        departures = new Departures();
        passenger = new Passenger();
        passenger2 = new Passenger();
        passengersBooked = new ArrayList<>();
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

    @Test
    public void addPlaneToFlight(){
//        airport.addPlaneToHangar(plane, airport.getHangar());
        airport.addPlaneToFlight(plane, 17, "Hawaii", "");
        assertEquals(1, airport.getDepartures().size());
    }

    @Test
    public void addPassengersToFlight(){
        airport.bookPassenger(passenger);
//        flight.bookPassenger(passenger2);
        assertEquals(1, airport.getPassengers().size());
    }

}