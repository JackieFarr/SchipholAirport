public enum PlaneType {
    BOEING747(300),
    AIRBUS800(800),
    BOEING200(100);

    private final int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

}
