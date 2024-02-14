package hwk1;

public class hourlyEmployee extends employee {
    String wage;
    int hours;

    public hourlyEmployee(String firstName, String lastName, String SSN, String wage, int hours)
    {
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.hours = hours;
    }

    public String getWage(){
        return wage;
    }

    public void setWage(String wage){
        this.wage = wage;
    }

    public int getHours(){
        return hours;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
    }


}
