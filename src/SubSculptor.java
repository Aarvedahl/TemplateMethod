public class SubSculptor {

    public static void main(String [] args) {

        Sub customer = new ItalianSub();
        customer.makeSandwhich();

        Sub customer1 = new VeggieSub();
        customer1.makeSandwhich();
    }
}
