package lesson11;

import java.util.HashSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1000, 3);
        Coin coin2 = new Coin(5, 1000, 3);
        Coin coin3 = new Coin(1, 1500, 2);
        Coin coin4 = new Coin(2, 1800, 7);
        Coin coin5 = new Coin(5, 1400, 3);
        Coin coin6 = new Coin(7, 1800, 9);

        TreeSet<Coin> coins = new TreeSet<>();

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);
        for (Coin coin : coins) {
            System.out.println(coin);
        }

    }
}
