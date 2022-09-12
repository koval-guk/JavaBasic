package dz11.task5;

import java.util.Scanner;

public class Bet {
    private int betValue;
    private double betHazard;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bet bet = new Bet();
        System.out.print("set value : ");
        bet.setBetValue(scanner.nextInt());
        System.out.print("set hazard : ");
        bet.setBetHazard(scanner.nextDouble());
        System.out.println(bet.getBetValue() + "  " + bet.getBetHazard());
        scanner.close();
    }

    public Bet() {
    }

    public Bet(int betValue, double betHazard) {
        this.betValue = betValue;
        this.betHazard = betHazard;
    }

    public int getBetValue() {
        return betValue;
    }

    public void setBetValue(int betValue) {
        this.betValue = betValue;
    }

    public double getBetHazard() {
        return betHazard;
    }

    public void setBetHazard(double betHazard) {
        this.betHazard = betHazard;
    }
}
