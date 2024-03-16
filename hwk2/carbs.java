package hwk2;
import java.util.Random;


public class carbs implements nutrientFactory {
    private String[] noRestriction = {"Cheese", "Bread", "Lentils", "Pistachio"};
    private String[] paleo = {"pistachio"};
    private String[] vegan = {"Bread", "Lentils", "Pistachio"};
    private String[] nutAllergy = {"Cheese", "Bread", "Lentils"};
    Random rand = new Random();

    @Override
    public String createCarb(String dietPlan){
        switch(dietPlan) {
            case "noRestriction":
                return noRestriction[rand.nextInt(noRestriction.length)];
            case "paleo":
                return paleo[rand.nextInt(paleo.length)];
            case "vegan":
                return vegan[rand.nextInt(vegan.length)];
            case "nutAllergy":
                return nutAllergy[rand.nextInt(nutAllergy.length)];
            default:
                throw new IllegalArgumentException("Try again");
        }
    }

    @Override
    public String createProtein(String dietPlan) {
        throw new UnsupportedOperationException("Carbs factory can't create Protein");
    }
    @Override
    public String createFat(String dietPlan) {
        throw new UnsupportedOperationException("Carbs factory can't create fats");
    }
}
