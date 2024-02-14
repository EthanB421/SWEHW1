package hwk1;

public class commissionEmployee extends employee {
    private String comRate;
    private String sales;

    public commissionEmployee(String firstName, String lastName, String SSN, String comRate, String sales)
    {
        super(firstName, lastName, SSN);
        this.comRate = comRate;
        this.sales = sales;
    }

    public String getComRate(){
        return comRate;
    }

    public void setComRate(String comRate){
        this.comRate = comRate;
    }

    public String getSales(){
        return sales;
    }

    public void setSales(String sales)
    {
        this.sales = sales;
    }
}
