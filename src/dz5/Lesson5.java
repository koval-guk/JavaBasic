package dz5;

public class Lesson5 {
    final boolean T = true;
    final boolean F = false;


    public void prim1() {
        if ((!T & !F) == (!(T | F))) {
            System.out.println("(!T & !F) = (!(T | F)) ?");
            System.out.println("yes " + (!T & !F) + " = " + (!(T | F)));
            System.out.println("****1****");
        }
    }

    public void prim2() {
        if ((!T & F) == (!(T | !F))) {
            System.out.println("(!T & F) = (!(T | !F)) ?");
            System.out.println("yes " + (!T & F) + " = " + (!(T | !F)));
            System.out.println("****2****");
        }
    }

    public void prim3() {
        if ((T & !F) == (!(!T | F))) {
            System.out.println("(T & !F) = (!(!T | F)) ?");
            System.out.println("yes " + (T & !F) + " = " + (!(!T | F)));
            System.out.println("****3****");
        }
    }

    public void prim4() {
        if ((T & F) == (!(!T | !F))) {
            System.out.println("(T & F) = (!(!T | !F)) ?");
            System.out.println("yes " + (T & F) + " = " + (!(!T | !F)));
            System.out.println("****4****");
        }
    }

    public void prim5() {
        if ((!T | !F) == (!(T & F))) {
            System.out.println("!(T | !F) = (!(T & F)) ?");
            System.out.println("yes " + (!T | !F) + " = " + (!(T & F)));
            System.out.println("****5****");
        }
    }

    public void prim6() {
        if ((!T | F) == (!(T & !F))) {
            System.out.println("(!T | F) = (!(T & !F)) ?");
            System.out.println("yes " + (!T | F) + " = " + (!(T & !F)));
            System.out.println("****6****");
        }
    }

    public void prim7() {
        if ((T | !F) == (!(!T & F))) {
            System.out.println("(T | !F) = (!(!T & F)) ?");
            System.out.println("yes " + (T | !F) + " = " + (!(!T & F)));
            System.out.println("****7****");
        }
    }

    public void prim8() {
        if ((T | F) == (!(!T & !F))) {
            System.out.println("(T | F) = (!(!T & !F)) ?");
            System.out.println("yes " + (T | F) + " = " + (!(!T & !F)));
            System.out.println("****8****");
        }
    }
}
