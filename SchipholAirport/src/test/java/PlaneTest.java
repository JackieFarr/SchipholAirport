import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    private Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING200, "KLM");
        passenger = new Passenger();
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.BOEING200, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(100, plane.getPlaneCapacity());
    }

    @Test
    public void checkPlaneStartsEmpty(){
        assertEquals(0, plane.numOfPassengers());
    }

    @Test
    public void canGetPassengers(){
        assertEquals(0, plane.getPassengers().size());
    }



    @Test
    public void checkPlaneCanAddPassenger(){
        plane.addPassenger(passenger);
        assertEquals(1, plane.numOfPassengers());
    }

}
