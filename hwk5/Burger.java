package hwk5;

import java.util.ArrayList;

public class Burger implements foodDecorator{
    private String item;
    private double price;
    private ArrayList<String> toppings;
    
    public Burger(double price)
    {
        this.item = "Burger";
        this.price = price;
        this.toppings = new ArrayList<String>();
    }

    @Override
    public String getFood()
    {
        return this.item;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
    
    @Override
    public ArrayList<String> getToppings() {
        return this.toppings;
    }
}
