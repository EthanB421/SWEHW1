package hwk5;

import java.util.ArrayList;

public class Order {
    private ArrayList<foodDecorator> foodOrdered;
    
    public Order()
    {
        this.foodOrdered = new ArrayList<foodDecorator>();
    }

    public void addItem(foodDecorator food)
    {
        this.foodOrdered.add(food);
    }

    public double calculateCost()
    {
        double grandTotal = 0;
        for(foodDecorator item : this.foodOrdered)
        {
            grandTotal += item.getPrice();
        }

        return grandTotal;
    }
}
