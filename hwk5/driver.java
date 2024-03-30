package hwk5;

public class driver {
    public static void main(String[] args) {
        foodDecorator burger = new Burger(5.00);
        burger = new Ketchup(0.5, burger);
        burger = new Mustard(0.51, burger);
        System.out.println("First item: "+burger.getFood());
        System.out.println("Toppings: "+burger.getToppings());
        System.out.println("Price of item with toppings: "+ burger.getPrice());
        System.out.println("-------------------------------------------------");


        foodDecorator hotdog = new Hotdog(2.00);
        hotdog = new Ketchup(0.5, hotdog);
        hotdog = new Relish(0.2, hotdog);
        System.out.println("Second item: "+hotdog.getFood());
        System.out.println("Toppings: "+hotdog.getToppings());
        System.out.println("Price of item with toppings: "+ hotdog.getPrice());
        System.out.println("-------------------------------------------------");

        foodDecorator fries = new Fries(4.00);
        fries = new Ketchup(0.5, fries);
        System.out.println("Third item: "+fries.getFood());
        System.out.println("Toppings: "+fries.getToppings());
        System.out.println("Price of item with toppings: "+ fries.getPrice());
        System.out.println("-------------------------------------------------");

        Order completedOrder = new Order();
        completedOrder.addItem(burger);
        completedOrder.addItem(hotdog);
        completedOrder.addItem(fries);

        System.out.println("Before discount: "+completedOrder.calculateCost());

        Loyalty loyalty = new Loyalty("Regular");
        System.out.println("After discount: "+loyalty.applyDiscount(completedOrder));
        
        


    }

}
