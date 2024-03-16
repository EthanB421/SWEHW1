package hwk2;

import java.util.ArrayList;
import java.util.List;

public class pizzaBuilder {
    private String chain;
    private String size;
    private List<String> toppings;

    public pizzaBuilder() {    
    }
    public pizzaBuilder setChain(String chain) {
        this.chain = chain;
        return this;
    }
    public pizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public void addTopping(String topping)
    {
        toppings.add(topping);
    }

    public pizza createPizza() {
        toppings = new ArrayList<>();
        return new pizza(chain, size);
    }

    public void eat(){
        System.out.println(this.chain);
        System.out.println(this.size);
        System.out.println(this.toppings);
    }
}
