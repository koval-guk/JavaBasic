package dz11.task3;

public class Computer {
    String name;

    @Override
    public String toString() {
        return "Computer name is " + name;
    }

    public Computer(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        Computer computer0 = new Computer("first");
        computers[0] = computer0;
        Computer computer1 = new Computer("cheap");
        computers[1] = computer1;
        Computer computer2 = new Computer("work");
        computers[2] = computer2;
        Computer computer3 = new Computer("lep-top");
        computers[3] = computer3;
        Computer computer4 = new Computer("my");
        computers[4] = computer4;
        for (Computer name : computers) {
            System.out.println(name.toString());
        }
    }
}
