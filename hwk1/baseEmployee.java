package hwk1;

public class baseEmployee extends employee {
    private String baseSalary;

    public baseEmployee(String firstName, String lastName, String SSN, String baseSalary)
    {
        super(firstName, lastName, SSN);
        this.baseSalary = baseSalary;
    }

    public String getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(String baseSalary){
        this.baseSalary = baseSalary;
    }
}
