package hwk8;

public class SnackDispenseHandler {
    private Snack snack;
    private SnackDispenseHandler nextHandler;

    public SnackDispenseHandler(Snack snack, SnackDispenseHandler nextHandler)
    {
        this.snack = snack;
        this.nextHandler = nextHandler;
    }

    public Snack dispenseSnack(String selectedSnack, double amount)
    {
        if(selectedSnack == snack.name && amount >= snack.price && snack.quantity>0)
        {
            System.out.println("Dispensing: "+snack.name);
            snack.quantity--;
            return snack;
        }
        else if (nextHandler != null)
        {
            return nextHandler.dispenseSnack(selectedSnack, amount);
        }else {
            System.out.println(selectedSnack+" is unavailable");
            return snack;
        }
    }
}
