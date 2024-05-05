package hwk8;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Snack> snacks;
    private StateOfVendingMachine state;
    private SnackDispenseHandler snackDispenser;
    private double funds;

    public VendingMachine(ArrayList<Snack> snacks)
    {
        this.snacks = snacks;
        this.funds = 0;
        this.snackDispenser = initChain();
    }

    public SnackDispenseHandler initChain()
    {
        SnackDispenseHandler chain = null;
        for  (int i = 0; i<=this.snacks.size()-1; i++)
        {
            chain = new SnackDispenseHandler(snacks.get(i), chain);
        }
        return chain;
    }

    public void dispenseSnack(String snack)
    {
        funds -= snackDispenser.dispenseSnack(snack, funds).price;
    }

    public void insertMoney(double amount)
    {
        funds += amount;
    }

    public Snack selectSnack(String selectedSnack)
    {
        for(Snack snack : snacks)
        {
            if(selectedSnack == snack.name)
            {
                return snack;
            }
        }
        System.out.println("Snack does not exist");
        return null;
    }

}
