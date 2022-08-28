package dz4;

import java.util.Scanner;

public class SetGet {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Scanner inName = new Scanner(System.in);
        System.out.println("set name 1");
        String sName1 = inName.nextLine();
        System.out.println("set name 2");
        String sName2 = inName.nextLine();
        person1.setName(sName1);
        person2.setName(sName2);
        person1.setAge(36);
        person2.setAge(88);
        person1.say();
        person2.say();
        System.out.println("name " + person1.getName() + " age " + person1.getAge());
        inName.close();
    }
}

class Person {
    private String name;
    int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("no valid name");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("No valid age");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    void say() {
        System.out.println("name " + name + " age " + age);
    }
}
