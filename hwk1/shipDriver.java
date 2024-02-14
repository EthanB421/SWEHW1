package hwk1;

public class shipDriver {
    public static void main(String[] args) {
        ship[] ships = new ship[3];
        ships[0] = new ship("Ship A", "2000");
        ships[1] = new cruiseShip("Cruise Ship B", "2010", 500);
        ships[2] = new cargoShip("Cargo Ship C", "2020", 1000);   
        for (ship i : ships)
        {
            i.printDetails();
        }
    }
}
