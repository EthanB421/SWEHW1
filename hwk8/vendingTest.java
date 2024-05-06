package hwk8;

import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class vendingTest {

    @SuppressWarnings("deprecation")
    @Test
    public void testDispenseSnack() {
        ArrayList<Snack> snacks = new ArrayList<>();
        snacks.add(new Snack("Coke", 1.50, 2));
        snacks.add(new Snack("Pepsi", 1.50, 8));
        VendingMachine vendingMachine = new VendingMachine(snacks);

        vendingMachine.insertMoney(2.00);

        //Dispensing snack
        vendingMachine.dispenseSnack("Coke");

        assertEquals(1, snacks.get(0).quantity);

        //Dispensing snack that is out of stock
        vendingMachine.dispenseSnack("Snickers");

    }

    @Test
    public void testSelectSnack() {
        ArrayList<Snack> snacks = new ArrayList<>();
        snacks.add(new Snack("Coke", 1.50, 2));
        snacks.add(new Snack("Pepsi", 1.50, 8));
        VendingMachine vendingMachine = new VendingMachine(snacks);

        //Select snack
        Snack selectedSnack = vendingMachine.selectSnack("Coke");

        assertEquals("Coke", selectedSnack.name);

        selectedSnack = vendingMachine.selectSnack("Snickers");

        assertNull(selectedSnack);
    }
}
