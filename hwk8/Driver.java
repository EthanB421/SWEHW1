package hwk8;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
       ArrayList<Snack> snacks = new ArrayList<>();  

       snacks.add(new Snack("Coke", 1.50, 2));
       snacks.add(new Snack("Pepsi", 1.50, 8));
       snacks.add(new Snack("Cheetos", 2.00, 5));
       snacks.add(new Snack("Doritos", 2.00, 7));
       snacks.add(new Snack("KitKat", 1.25, 6));
       snacks.add(new Snack("Snickers", 1.25, 0));

       VendingMachine vendingMachine = new VendingMachine(snacks);
       vendingMachine.insertMoney(10);
       Snack selectedSnack = vendingMachine.selectSnack("Coke");
       vendingMachine.dispenseSnack(selectedSnack.name);
       selectedSnack = vendingMachine.selectSnack("Snickers");
       vendingMachine.dispenseSnack(selectedSnack.name);
    }
}
