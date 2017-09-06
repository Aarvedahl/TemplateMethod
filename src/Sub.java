public abstract class Sub {

    // Template methods
    final void makeSandwhich() {

        cutBread();

        if(customerWantsMeat()) {
            addMeat();
        }
        if(customerWantsCheese()) {
            addCheese();
        }
        if(customerWantsVegetables()) {
            addVegtables();
        }

        wrapSub();
    }

    // Abstract methods
    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegtables();

    // Hook methods
    boolean customerWantsMeat(){return true;}
    boolean customerWantsCheese() {return true;}
    boolean customerWantsVegetables() {return true;}

    // Concrete methods
    public void cutBread() {
        System.out.println("The sub is cut");
    }

    public void wrapSub() {
        System.out.println("Wrap the sub");
    }

}
