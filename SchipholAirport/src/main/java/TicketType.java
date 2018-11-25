import sun.security.krb5.internal.Ticket;

public enum TicketType {
    Economy(100),
    FirstClass(500);

    private final int price;

    TicketType(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
