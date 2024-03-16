package hwk2;

public class pizzaDriver {
    public static void main(String[] args) {
        pizzaBuilder smallPizza = new pizzaBuilder();
        smallPizza.createPizza();
        smallPizza.setChain("Pizza Hut");
        smallPizza.setSize("Small");
        smallPizza.addTopping("Pepperoni");
        smallPizza.addTopping("Ham");
        smallPizza.addTopping("Pesto");
        smallPizza.eat();
    
        pizzaBuilder mediumPizza = new pizzaBuilder();
        mediumPizza.createPizza();
        mediumPizza.setChain("Pizza Hut");
        mediumPizza.setSize("Medium");
        mediumPizza.addTopping("Sausage");
        mediumPizza.addTopping("Bacon");
        mediumPizza.addTopping("Onions");
        mediumPizza.addTopping("Extra Cheese");
        mediumPizza.addTopping("Peppers");
        mediumPizza.addTopping("Chicken");
        mediumPizza.eat();
    
        pizzaBuilder largePizza = new pizzaBuilder();
        largePizza.createPizza();
        largePizza.setChain("Pizza Hut");
        largePizza.setSize("Large");
        largePizza.addTopping("Ham");
        largePizza.addTopping("Sausage");
        largePizza.addTopping("Pesto");
        largePizza.addTopping("Spicy Pork");
        largePizza.addTopping("Pineapple");
        largePizza.addTopping("Beef");
        largePizza.addTopping("Spinach");
        largePizza.addTopping("Olives");
        largePizza.addTopping("Bacon");
        largePizza.eat();
    
        pizzaBuilder pizzaHutLarge = new pizzaBuilder();
        pizzaHutLarge.createPizza();
        pizzaHutLarge.setChain("Pizza Hut");
        pizzaHutLarge.setSize("Large");
        pizzaHutLarge.addTopping("Pepperoni");
        pizzaHutLarge.addTopping("Mushrooms");
        pizzaHutLarge.addTopping("Onions");
        pizzaHutLarge.eat();
    
        
        pizzaBuilder pizzaHutSmall = new pizzaBuilder();
        pizzaHutSmall.createPizza();
        pizzaHutSmall.setChain("Pizza Hut");
        pizzaHutSmall.setSize("Small");
        pizzaHutSmall.addTopping("Pepperoni");
        pizzaHutSmall.addTopping("Mushrooms");
        pizzaHutSmall.eat();
    
        pizzaBuilder littleCaesarsMedium = new pizzaBuilder();
        littleCaesarsMedium.createPizza();
        littleCaesarsMedium.setChain("Little Caesars");
        littleCaesarsMedium.setSize("Medium");
        littleCaesarsMedium.addTopping("Pepperoni");
        littleCaesarsMedium.addTopping("Mushrooms");
        littleCaesarsMedium.addTopping("Onions");
        littleCaesarsMedium.addTopping("Sausage");
        littleCaesarsMedium.addTopping("Green Peppers");
        littleCaesarsMedium.addTopping("Black Olives");
        littleCaesarsMedium.addTopping("Bacon");
        littleCaesarsMedium.addTopping("Extra Cheese");
        littleCaesarsMedium.eat();
    
        pizzaBuilder littleCCaesarsSmall = new pizzaBuilder();
        littleCCaesarsSmall.createPizza();
        littleCCaesarsSmall.setChain("Little Caesars");
        littleCCaesarsSmall.setSize("Small");
        littleCCaesarsSmall.addTopping("Pepperoni");
        littleCCaesarsSmall.addTopping("Mushrooms");
        littleCCaesarsSmall.addTopping("Onions");
        littleCCaesarsSmall.addTopping("Sausage");
        littleCCaesarsSmall.addTopping("Green Peppers");
        littleCCaesarsSmall.addTopping("Black Olives");
        littleCCaesarsSmall.eat();
    
        pizzaBuilder dominosSmall1Topping = new pizzaBuilder();
        dominosSmall1Topping.createPizza();
        dominosSmall1Topping.setChain("Dominos");
        dominosSmall1Topping.setSize("Small");
        dominosSmall1Topping.addTopping("Pepperoni");
        dominosSmall1Topping.eat();
    
        pizzaBuilder dominosLarge = new pizzaBuilder();
        dominosLarge.createPizza();
        dominosLarge.setChain("dominos");
        dominosLarge.setSize("Large");
        dominosLarge.addTopping("Pepperoni");
        dominosLarge.addTopping("Mushrooms");
        dominosLarge.addTopping("Onions");
        dominosLarge.eat();
    }
}
