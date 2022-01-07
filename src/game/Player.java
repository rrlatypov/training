package game;

public class Player {
    protected Card[] hand = new Card[20];

    public void addCardToHand(Card card) {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == null) {
                hand[i] = card;
                break;
            }
        }
    }

    public void printHand() {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != null) {
                System.out.println(hand[i]);
            }
        }

    }

    public int countTotalValues() {
        int totalValueCards = 0;
        for (Card card:hand) {
            if (card != null) {
                totalValueCards = totalValueCards + card.getValue();

            }
        }
        return totalValueCards;
    }
}
