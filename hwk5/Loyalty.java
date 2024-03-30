package hwk5;

public class Loyalty extends Order{
    private String status;
    private double discount;

    public Loyalty(String status)
    {
        this.status = status;
        if(this.status == "Rookie")
        {
            this.discount = 0.9;
        }else if(this.status == "Regular")
        {
            this.discount = 0.85;
        } else {
            this.discount = 0.8;
        }
    }

    
    public double applyDiscount(Order order)
    {
        double discountedPrice;
        discountedPrice = order.calculateCost()*discount;
        return discountedPrice;
    }
}
