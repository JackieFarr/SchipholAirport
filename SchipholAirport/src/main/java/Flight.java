public class Flight {

    private Plane plane;
    private int flightNum;
    private String destination;

    public Flight(Plane plane, int flightNum, String destination){
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
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
}
