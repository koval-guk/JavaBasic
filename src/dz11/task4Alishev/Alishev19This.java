package dz11.task4Alishev;

public class Alishev19This {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("beagle");
        cat1.setAge(7);
        cat1.getInfo();
        Cat cat2 = new Cat();
        cat2.setName("cat");
        cat2.setAge(1);
        cat2.getInfo();
    }

    static class Cat {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void getInfo() {
            System.out.println(name + " - " + age);
        }
    }
}
