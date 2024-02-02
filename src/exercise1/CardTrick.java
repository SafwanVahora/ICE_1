package exercise1;

import java.util.Random;

/**
 * @author Safwan Vahora
 * @date February 2, 2024
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(generateRandomNumber());
            card.setSuit(Card.SUITS[generateRandomNumberBetween(0, 3)]);
            hand[i] = card;
        }

    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(13) + 1;
    }

    private static int generateRandomNumberBetween(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Safwan Vahora");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Your career ambitions here");

        System.out.println("My hobbies:");
        System.out.println("-- Your hobbies here");

        System.out.println();
    }
}