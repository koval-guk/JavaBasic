package dz4;

public class This {
    public static void main(String[] args) {
        Banana banana1 = new Banana();
        banana1.setNum(3);
        banana1.setSort("green");
        banana1.out();
        Banana banana2 = new Banana();
        banana2.setNum(5);
        banana2.setSort("turkish");
        banana2.out();
    }
}
class Banana{
    int num;
    String sort;
    public void setNum(int num){
        this.num = num;
    }
    public void setSort(String sort){
        this.sort = sort;
    }

    public int getNum() {
        return num;
    }

    public String getSort() {
        return sort;
    }
    public void out(){
        System.out.println(sort+"  "+num);
    }
}
