package dz6;

import dz6.Hello.GoodDay.SayGoodDay;
import dz6.Hello.ImHere.SayImHere;
import dz6.Hello.SayHello;

public class Test27Packages {
    public static void main(String[] args) {
        SayHello hi = new SayHello();
        SayGoodDay gd = new SayGoodDay();
        SayImHere ih = new SayImHere();
        hi.sayH();
        gd.sayGD();
        ih.sayI();
    }
}
