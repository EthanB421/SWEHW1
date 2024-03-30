package hwk5;

import java.util.ArrayList;

public class Ketchup implements foodDecorator{
    private foodDecorator item;
    private double price;
    private ArrayList<String> toppings;

    public Ketchup(double price, foodDecorator item)
    {
        this.item = item;
        this.price = price;
        this.item.getToppings().add("Ketchup");
    }

    @Override
    public String getFood()
    {
        return this.item.getFood();
    }

    @Override
    public double getPrice() {
        return this.item.getPrice() + this.price;
    }
    
    @Override
    public ArrayList<String> getToppings() {
        return this.item.getToppings();
    }

}
