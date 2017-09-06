public class ItalianSub extends Sub {

    String meat = "Pepperoni";
    String cheese = "Cheddar";
    String[] veggiesUsed = {"Salad", "Tomatoes", "Onions"};

    @Override
    void addMeat() {
        System.out.println("Adding the meat: " +  meat);
    }

    @Override
    void addCheese() {
        System.out.println("Adding the cheese: " + cheese);
    }

    @Override
    void addVegtables() {
        for(String veggie: veggiesUsed) {
            System.out.println("Adding the veggies: " + veggie);
        }
    }
}
