package dz6;

import dz6.AccessPack.AccessClass;

public class Test28AccessMods extends AccessClass {
    public static void main(String[] args) {
        AccessClass1 acc1Class1 = new AccessClass1();
        int priv = acc1Class1.getAccPrivate();
        System.out.println("'5' is good");
        if (AccessClass.accPublic == 5) {
            System.out.print("public accessed ");
            System.out.println(AccessClass.accPublic);
        }
        if (acc1Class1.accDefault == 5) {
            System.out.print("default accessed ");
            System.out.println(acc1Class1.accDefault);
        }
        if ((acc1Class1.accProtected == 5) && (AccessClass.accProtected1 == 5)) {
            System.out.print("protected accessed ");
            System.out.print(acc1Class1.accProtected);
            System.out.println(AccessClass.accProtected1);
        }
        if (priv == 5) {
            System.out.print("private accessed ");
            System.out.println(priv);
        }
    }
}
