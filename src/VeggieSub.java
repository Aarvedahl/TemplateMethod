public class VeggieSub extends Sub {

    String[] veggiesUsed = {"Salad", "Tomatoes", "Onions"};

    boolean customerWantsMeat(){return false;}
    boolean customerWantsCheese(){return false;}

    @Override
    void addMeat() { }

    @Override
    void addCheese() { }

    @Override
    void addVegtables() {
        for (String veggie: veggiesUsed) {
            System.out.println("Adding veggie: " + veggie);
        }
    }
}
