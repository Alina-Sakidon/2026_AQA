package hw4.pockerGame;

import hw8.EmptyDeckException;

import java.util.Random;

public class Game {
    private int noOfPlayers;
    private int noOfCards;
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private String[] ranks = {
            "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"
    };
    private Card[] deck;

    public Card[] createDeck() {
        deck = new Card[noOfCards];
        if (noOfCards <= 0) {
            throw new EmptyDeckException("no of cards should be more than 0");
        }
        System.out.println("Create deck: ");
        int count = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[count] = new Card(suit, rank);
                count++;
            }
        }
        return deck;
    }

    public Card[] shuffleDeck(Card[] cards) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int in = random.nextInt(noOfCards);
            int out = random.nextInt(noOfCards);
            Card card = cards[in];
            cards[in] = cards[out];
            cards[out] = card;
        }
        return cards;
    }

    public void serveDeck(Card[] deck) {
        int count = 0;
        for (int round = 1; round <= 5; round++) {
            System.out.printf("\nRound %s: ", round);
            for (int player = 1; player <= noOfPlayers; player++) {
                if (noOfPlayers < 2) {
                    throw new IllegalArgumentException("Numbers of users should be greater than 1");
                }
                Card card = deck[count];
                System.out.println(String.format("Player %s receive card %s", player, card));
                count++;
            }
        }
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public int getNoOfCards() {
        return noOfCards;
    }

    public void setNoOfCards(int noOfCards) {
        this.noOfCards = noOfCards;
    }

    public String[] getSuits() {
        return suits;
    }

    public void setSuits(String[] suits) {
        this.suits = suits;
    }

    public String[] getRanks() {
        return ranks;
    }

    public void setRanks(String[] ranks) {
        this.ranks = ranks;
    }
}

