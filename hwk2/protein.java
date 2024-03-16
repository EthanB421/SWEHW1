package hwk2;
import java.util.Random;

public class protein implements nutrientFactory {
    private String[] noRestriction = {"Fish", "Chicken", "Beef", "Tofu"};
    private String[] vegan = {"Tofu"};
    private Random rand = new Random();

    @Override
    public String createProtein(String dietPlan) {
        switch (dietPlan) {
            case "noRestriction":
                return noRestriction[rand.nextInt(noRestriction.length)];
            case "vegan":
                return vegan[rand.nextInt(vegan.length)];
            case "nutAllergy":
                return noRestriction[rand.nextInt(noRestriction.length)];
            case "paleo":
                return noRestriction[rand.nextInt(noRestriction.length - 1)]; // Exclude the last item (Tofu)
            default:
                throw new IllegalArgumentException("Try again");
        }
    }

    @Override
    public String createCarb(String dietPlan) {
        throw new UnsupportedOperationException("Protein factory can't create Carbs");
    }
    @Override
    public String createFat(String dietPlan) {
        throw new UnsupportedOperationException("Protein factory can't create fats");
    }
}