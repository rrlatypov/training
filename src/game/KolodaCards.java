package game;

import java.util.concurrent.ThreadLocalRandom;

public class KolodaCards {
    private Card[] cards = new Card[52];

    public void prepareCards() {
        this.cards[0] = new Card("двойка треф", 2);
        this.cards[1] = new Card("двойка бубей", 2);
        this.cards[2] = new Card("двойка червей", 2);
        this.cards[3] = new Card("двойка пикей", 2);
        this.cards[4] = new Card("тройка треф", 3);
        this.cards[5] = new Card("тройка бубей", 3);
        this.cards[6] = new Card("тройка червей", 3);
        this.cards[7] = new Card("тройка пикей", 3);
        this.cards[8] = new Card("четверка треф", 4);
        this.cards[9] = new Card("четверка бубей", 4);
        this.cards[10] = new Card("четверка червей", 4);
        this.cards[11] = new Card("четверка пикей", 4);
        this.cards[12] = new Card("пятерка треф", 5);
        this.cards[13] = new Card("пятерка бубей", 5);
        this.cards[14] = new Card("пятерка червей", 5);
        this.cards[15] = new Card("пятерка пикей", 5);
        this.cards[16] = new Card("шестерка треф", 6);
        this.cards[17] = new Card("шестерка бубей", 6);
        this.cards[18] = new Card("шестерка червей", 6);
        this.cards[19] = new Card("шестерка пикей", 6);
        this.cards[20] = new Card("семерка треф", 7);
        this.cards[21] = new Card("семерка бубей", 7);
        this.cards[22] = new Card("семерка червей", 7);
        this.cards[23] = new Card("семерка пикей", 7);
        this.cards[24] = new Card("восьмерка треф", 8);
        this.cards[25] = new Card("восьмерка бубей", 8);
        this.cards[26] = new Card("восьмерка червей", 8);
        this.cards[27] = new Card("восьмерка пикей", 8);
        this.cards[28] = new Card("девятка треф", 9);
        this.cards[29] = new Card("девятка бубей", 9);
        this.cards[30] = new Card("девятка червей", 9);
        this.cards[31] = new Card("девятка пикей", 9);
        this.cards[32] = new Card("десятка треф", 10);
        this.cards[33] = new Card("десятка бубей", 10);
        this.cards[34] = new Card("десятка червей", 10);
        this.cards[35] = new Card("десятка пикей", 10);
        this.cards[36] = new Card("валет треф", 2);
        this.cards[37] = new Card("валет бубей", 2);
        this.cards[38] = new Card("валет червей", 2);
        this.cards[39] = new Card("валет пикей", 2);
        this.cards[40] = new Card("дама треф", 3);
        this.cards[41] = new Card("дама бубей", 3);
        this.cards[42] = new Card("дама червей", 3);
        this.cards[43] = new Card("дама пикей", 3);
        this.cards[44] = new Card("король треф", 4);
        this.cards[45] = new Card("король бубей", 4);
        this.cards[46] = new Card("король червей", 4);
        this.cards[47] = new Card("король пикей", 4);
        this.cards[48] = new Card("туз треф", 11);
        this.cards[49] = new Card("туз бубей", 11);
        this.cards[50] = new Card("туз червей", 11);
        this.cards[51] = new Card("туз пикей", 11);


    }

    public Card getRandomCard() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 51 + 1);

        return cards[randomNum];
    }
}
