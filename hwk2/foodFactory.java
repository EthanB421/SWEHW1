package hwk2;

public class foodFactory {
        public static Object getNutrient(String dietPlan){
            switch(dietPlan){
                case "carbPlan":
                    return new carbs();
                case "fatsPlan":
                    return new fats();
                case "proteinPlan":
                    return new protein();
                default:
                    throw new IllegalArgumentException("Try again");
            }
        }
}
