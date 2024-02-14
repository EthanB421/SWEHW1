package hwk1;

public class salariedEmployee extends employee{
    private String salary;
    public salariedEmployee(String firstName, String lastName, String SSN, String salary){
        super(firstName, lastName, SSN);
        this.salary = salary;
    }
    public String getSalary(){
        return salary;
    }

    public void setSalary(String salary){
        this.salary = salary;
    }
}
