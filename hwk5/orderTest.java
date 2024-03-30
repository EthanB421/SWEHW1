package hwk5;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class orderTest {
    @Test
    public void priceTest(){
    foodDecorator burger = new Burger(5.00);
    Double price = burger.getPrice();
    Double testPrice = 5.00;
    assertEquals(price, testPrice);
    };

    @Test
    public void nameTest(){
    foodDecorator burger = new Burger(5.00);
    String name = burger.getFood();
    String  testName = "Burger";
    assertEquals(name, testName);
    }
    @Test
    public void toppingsTest(){
        foodDecorator fries = new Fries(2.00);
        fries = new Ketchup(0.2, fries);
        ArrayList<String>  toppings = fries.getToppings();
        ArrayList<String> testToppings = new ArrayList<>();
        testToppings.add("Ketchup");
        assertEquals(toppings, testToppings);
    }

    @Test
    public void toppingsPriceTest(){
        foodDecorator fries = new Fries(2.00);
        fries = new Ketchup(0.2, fries);
        Double friesPrice = fries.getPrice();
        Double testToppingPrice = 2.2;
        assertEquals(friesPrice, testToppingPrice);
    }
    @Test
    public void calculateCostTest(){
        foodDecorator burger = new Burger(5.00);
        Order completedOrder = new Order();
        completedOrder.addItem(burger);
        Double totalCost = completedOrder.calculateCost();
        Double testCost = 5.00;
        assertEquals(totalCost, testCost);
    }

    @Test
    public void loyaltyTest(){
        foodDecorator burger = new Burger(5.00);
        Order completedOrder = new Order();
        completedOrder.addItem(burger);
        Loyalty loyalty = new Loyalty("Regular");
        Double discountedPrice =loyalty.applyDiscount(completedOrder);
        Double testPrice = 4.25;
        assertEquals(discountedPrice, testPrice);
    }
}
