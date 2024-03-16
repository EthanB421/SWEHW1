package hwk2;

public class Client {
    private  String name;
    private  String dietPlan;

    public Client(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return name;
    }

    public String getDietPlan() {
        return dietPlan;
    }
}