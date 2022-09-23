package src.dz6;

public class Robot implements Info {
    public int idNumber;
    String createDate;

    public Robot(int idNumber, String createDate) {
        this.idNumber = idNumber;
        this.createDate = createDate;
    }

    public void message() {
        System.out.println("Yes, master?");
    }

    public void showInfo() {
        System.out.println("ID of it: " + this.idNumber);
    }

    public void showAge() {
        System.out.println("It create date : " + this.createDate);
    }
}
