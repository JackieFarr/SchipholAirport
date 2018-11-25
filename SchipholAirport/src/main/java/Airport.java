import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;

public class Airport {

    private String airportCode;
    private ArrayList<Plane> hangar;
    private ArrayList<Flight> departures;
    private ArrayList<Passenger> passengers;

    public Airport(String airportCode){
        this.airportCode = airportCode;
        this.hangar = new ArrayList<>();
        this.departures = new ArrayList<>();
        this.passengers = new ArrayList<>();
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

    public void addPlaneToFlight(Plane plane, int flightNum, String destination, String departures){
        Flight flight = new Flight(plane, flightNum, destination);
        this.departures.add(flight);
    }

    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    public void bookPassenger(Passenger passengers){
         this.passengers.add(passengers);

    }
}
