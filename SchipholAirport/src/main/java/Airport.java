import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;

public class Airport {

    private ArrayList<Plane> hangar;
    private String airportCode;
    private ArrayList<Flight> departures;

    public Airport(String airportCode){
        this.airportCode = airportCode;
        this.hangar = new ArrayList<>();
        this.departures = new ArrayList<>();
    }

    public String getAirportCode() {
        return this.airportCode;
    }

    public ArrayList<Flight> getDepartures() {
        return this.departures;
    }

    public ArrayList<Plane> getHangar(){
        return this.hangar;
    }

    public void createFlight(Plane plane, int flightNum, String destination){
        Flight flight = new Flight(plane, flightNum, destination);
        this.departures.add(flight);
    }

    public void addPlaneToHangar(Plane plane, ArrayList hangar){
        this.hangar.add(plane);
    }


}
