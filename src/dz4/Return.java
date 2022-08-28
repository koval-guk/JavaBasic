package dz4;

public class Return {
    public static void main(String[] args) {
        Cats cat1 = new Cats();
        Cats cat2 = new Cats();
        Cats cat3 = new Cats();
        cat1.name = "Пират";
        cat2.name = "Кот";
        cat3.name = "Рыжий";
        cat1.years = 5;
        cat2.years = 7;
        cat3.years = 1;
        int rem1 = cat1.remCat();
        int rem2 = cat2.remCat();
        int rem3 = cat3.remCat();
        String goodCat1 = cat1.goodCat();
        String goodCat2 = cat2.goodCat();
        String goodCat3 = cat3.goodCat();
        System.out.println("Коту " + goodCat1 + " осталось драть диван " + rem1 + " лет");
        System.out.println("Коту " + goodCat2 + " осталось драть диван " + rem2 + " лет");
        System.out.println("Коту " + goodCat3 + " осталось драть диван " + rem3 + " лет");
    }
}

class Cats {
    int years;
    String name;
    int standartCatLive = 15;

    int remCat() {
        int rem = standartCatLive - years;
        return rem;
    }

    String goodCat() {
        String nStr = name + ", хороший кот,";
        return nStr;
    }
}
