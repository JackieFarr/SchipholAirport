import java.util.ArrayList;

public class Plane {

    private PlaneType plane;
    private String airline;
    private ArrayList<Passenger> passenger;

    public Plane(PlaneType plane, String airline){
        this.plane = plane;
        this.airline = airline;
        this.passenger = new ArrayList<>();
    }

    public PlaneType getPlaneType(){
        return this.plane;
    }

    public ArrayList<Passenger>getPassengers(){
        return this.passenger;
    }

    public int getPlaneCapacity() {
        return this.plane.getCapacity();
    }

    public int numOfPassengers() {
        return this.passenger.size();
    }

    public void addPassenger(Passenger passenger){
        this.passenger.add(passenger);
    }
}
