package hwk8;

public class StateOfVendingMachine {
    private String state;

    public StateOfVendingMachine() {
        this.state = "Idle";
    }

    public void changeState(String newState) {
        this.state = newState;
    }

    public void selectSnack() {
        changeState("Waiting for Money");
    }

    public boolean insertMoney(float amount) {
        if (state.equals("Waiting for Money")) {
            changeState("Dispensing Snack");
            return true;
        }
        return false;
    }
}