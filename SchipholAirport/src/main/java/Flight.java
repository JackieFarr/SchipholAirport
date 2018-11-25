import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private int flightNum;
    private String destination;
    private TicketType ticket;
    private ArrayList<Passenger> passengersBooked;


    public Flight(Plane plane, int flightNum, String destination){
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.ticket = ticket;
//        this.passenger = passenger;
        this.passengersBooked = new ArrayList<>();
    }

    public Flight getFlight(Plane plane, int flightNum, String destination){
        Flight flight = new Flight(plane, flightNum, destination);
        return flight;
    }


    public Plane getPlane() {
        return this.plane;
    }

    public int getFlightNum() {
        return this.flightNum;
    }

    public String getDestination() {
        return this.destination;
    }

    public void bookPassenger(Passenger passenger){
        this.passengersBooked.add(passenger);
    }
}
