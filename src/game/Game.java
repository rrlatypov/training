package game;

public class Game {
    public static void printWinner(Player player1, Dealer dealer) {
        if (player1.countTotalValues() > dealer.countTotalValues() && player1.countTotalValues() <= 21
                && dealer.countTotalValues() > 21) {
            System.out.println("выиграл игрок");
            player1.printHand();
        } else {
            System.out.println(" --- выиграл крупье----");
            dealer.printHand();

        }
    }
}
