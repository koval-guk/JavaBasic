package src.dz6;

public class Test26Interfaces {
    public static void main(String[] args) {

        Human human1 = new Human("Petrovich", 45);
        Robot robot1 = new Robot(458231, "16.09.2112");
        human1.say();
        robot1.message();
        human1.showInfo();
        robot1.showInfo();
        System.out.println("***********");
        Info info1 = new Human("Nikiforovna", 72);
        Info info2 = new Robot(007, "MI 6");
        info1.showInfo();
        info2.showInfo();
        System.out.println("************");
        viewInfo(robot1);
        viewInfo(human1);
        System.out.println("*************");
        info1.showAge();
        robot1.showAge();
        System.out.println("*************");
        info1.showInfo();
        info1.showAge();
    }

    public static void viewInfo(Info info) {
        info.showInfo();
        info.showAge();
    }
}
