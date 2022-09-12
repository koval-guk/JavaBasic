package dz10;

public class Test48Enum {
    public static void main(String[] args) {
        NinjaTurtle leonardo = NinjaTurtle.LEONARDO;
        System.out.println(leonardo);
        System.out.println(NinjaTurtle.RAFAEL);
        System.out.println(leonardo.name());
        NinjaTurtle don = NinjaTurtle.valueOf("DONATELLO");
        System.out.println(don.getColour());
        System.out.println(NinjaTurtle.RAFAEL.getColour());
    }
}
