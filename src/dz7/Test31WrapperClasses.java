package dz7;

public class Test31WrapperClasses {
    public static void main(String[] args) {
        Integer a = new Integer(-34);
        System.out.println(a.compareTo(5));
        Boolean b = new Boolean(false);
        Long l = new Long(11111);
        long l2 = 88888;
        Long l3;
        l3 = l + l2;
        System.out.println(l3 + "" + b);
        StringBuilder s = new StringBuilder(l.toString());
        System.out.println(s);

    }
}
