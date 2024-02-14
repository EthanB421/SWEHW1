package hwk1;

public class cruiseShip extends ship {
    public int passengers;

    public cruiseShip(String name, String year, int passengers)
    {
        super(name, year);
        this.passengers = passengers;
    }

    public int getPassengers(){
        return passengers;
    }

    public void setPassengers(int passengers)
    {
        this.passengers = passengers;
    }
    @Override
    public void printDetails(){
        System.out.println("This ship's name is: "+name+" and it has "+passengers+ " passengers");
    }
}
