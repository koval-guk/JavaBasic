package dz3;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Market product1 = new Market();
        product1.veg = "Кабачок";
        product1.price = 56f;
        product1.weight = 200f;
        Market product2 = new Market();
        product2.veg = "Клубника";
        product2.price = 127f;
        product2.weight = 15f;
        float sum1=(product1.price/1000*product1.weight);
        System.out.print("Вот "+product1.veg+", стоит по ");
        System.out.printf("%.2f",sum1);
        System.out.printf( " грн за штуку %n");
        float sum2=(product2.price/1000*product2.weight);
        System.out.print("Вот "+product2.veg+", стоит по ");
        System.out.printf("%.2f",sum2);
        System.out.printf( " грн за штуку %n");
    }
}
class Market{
    String veg;
    float price;
    float weight;
}
