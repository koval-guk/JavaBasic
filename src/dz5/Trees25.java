package dz5;

public class Trees25 {
    public String color;
    public int height;
    public Trees25 (String color, int height){
        this.color = color;
        this.height = height;
    }
    public void growUp(){
        System.out.print(" is growing. It is "+height+" m.");
    }
    public void tree(){
        System.out.print(color+" tree");
    }
}
