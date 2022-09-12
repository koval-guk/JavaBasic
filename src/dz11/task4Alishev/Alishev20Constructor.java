package dz11.task4Alishev;

public class Alishev20Constructor {
    public static void main(String[] args) {
        Dog dog1 = new Dog("sharik", 15);
        Dog dog2 = new Dog("tuzik");
        Dog dog3 = new Dog();
    }

    static class Dog {
        private String name;
        private int age;

        public Dog() {
            this.name = "unknown";
            this.age = 0;
        }

        public Dog(String name) {
            this.name = name;
            this.age = 0;
        }

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
