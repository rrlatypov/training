package game;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        KolodaCards koloda = new KolodaCards();
        koloda.prepareCards();

        Player player1 = new Player();
        Dealer dealer = new Dealer();


        player1.addCardToHand(koloda.getRandomCard());
        player1.addCardToHand(koloda.getRandomCard());

        dealer.addCardToHand(koloda.getRandomCard());
        dealer.addCardToHand(koloda.getRandomCard());
        System.out.println("-----  карты у игрока");

        player1.printHand();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---------");
            System.out.println("еще одна карта?");
            String reshenie = scanner.nextLine();
            if (reshenie.equals("да")) {
                player1.addCardToHand(koloda.getRandomCard());
                System.out.println("-----  карты у игрока");
                player1.printHand();

            } else {
                break;
            }
        }
        while (dealer.needCard()){
            dealer.addCardToHand(koloda.getRandomCard());

        }
        Game.printWinner(player1, dealer);

    }
}
