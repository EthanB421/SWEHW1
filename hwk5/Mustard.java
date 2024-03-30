package hwk5;

import java.util.ArrayList;

public class Mustard implements foodDecorator{
    private foodDecorator item;
    private double price;
    private ArrayList<String> toppings;

    public Mustard(double price, foodDecorator item)
    {
        this.item = item;
        this.price = price;
        this.item.getToppings().add("Mustard");
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
