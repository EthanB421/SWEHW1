package hwk1;

public class cargoShip extends ship {
    private int capacity;

    public cargoShip(String name, String year, int capacity)
    {
        super(name, year);
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    @Override
    public void printDetails(){
        System.out.println("This ship's name is: "+name+" and it has a capacity of "+capacity+" tons");
    }
    
}
