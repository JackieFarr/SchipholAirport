import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> hangar;
    private String airportCode;

    public Airport(String airportCode){
        this.airportCode = airportCode;
        this.hangar = new ArrayList<>();
    }

    public String getAirportCode() {
        return this.airportCode;
    }

    public Flight createFlight(Plane plane, int flightNum, String destination){
        Flight flight = new Flight(plane, flightNum, destination);
        return flight;
    }
}
