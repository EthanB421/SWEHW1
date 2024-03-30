package hwk5;

import java.util.ArrayList;

public class Relish implements foodDecorator{
    private foodDecorator item;
    private double price;
    private ArrayList<String> toppings;

    public Relish(double price, foodDecorator item)
    {
        this.item = item;
        this.price = price;
        this.item.getToppings().add("Relish");
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
