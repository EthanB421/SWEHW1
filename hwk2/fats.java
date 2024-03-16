package hwk2;
import java.util.Random;

public class fats implements nutrientFactory {
    private String[] noRestriction = {"Avocado", "Sour cream", "Tuna", "Peanuts"};
    private String[] vegan = {"Avocado", "Peanuts"};
    private String[] paleo = {"Avocado", "Tuna", "Peanuts"};
    private String[] nutAllergy = {"Avocado", "Sour cream", "Tuna"}; 
    private Random rand = new Random();

    @Override
    public String createFat(String dietPlan) {
        switch (dietPlan) {
            case "noRestriction":
                return noRestriction[rand.nextInt(noRestriction.length)];
            case "vegan":
                return vegan[rand.nextInt(vegan.length)];
            case "paleo":
                return paleo[rand.nextInt(paleo.length)];
            case "nutAllergy":
                return nutAllergy[rand.nextInt(nutAllergy.length)];
            default:
                throw new IllegalArgumentException("Try again");
        }
    }

    @Override
    public String createCarb(String dietPlan) {
        throw new UnsupportedOperationException("Fats factory can't create Carbs");
    }

    @Override
    public String createProtein(String dietPlan) {
        throw new UnsupportedOperationException("Fats factory can't create protein");
    }
}
