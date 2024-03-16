package hwk2;

public class dietDriver {
    public static void main(String[]  args){
        Client[] clients = new Client[] {
            new Client("Ethan", "noRestriction"),
            new Client("Bill", "noRestriction"),
            new Client("Mikayla", "paleo"),
            new Client("Sydney", "vegan"),
            new Client("Jon", "nutAllergy"),
            new Client("Amy", "paleo"),
        };
        nutrientFactory carbFactory = new carbs();
        nutrientFactory proteinFactory = new protein();
        nutrientFactory fatsFactory = new fats();

        for(Client client : clients)
        {
            String chosenCarb = carbFactory.createCarb(client.getDietPlan());
            String chosenProtein = proteinFactory.createProtein(client.getDietPlan());
            String chosenFat = fatsFactory.createFat(client.getDietPlan());
            System.out.println("Client Name: "+client.getName());
            System.out.println("Diet Plan:"+client.getDietPlan());
            System.out.println(chosenCarb);
            System.out.println(chosenProtein);
            System.out.println(chosenFat);
        }
    }
}
