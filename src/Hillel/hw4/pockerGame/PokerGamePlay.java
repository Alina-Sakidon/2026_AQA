package Hillel.hw4.pockerGame;

public class PokerGamePlay {
    public static void main(String[] args) {
        Game game = new Game();
        game.setNoOfCards(52);
        game.setNoOfPlayers(4);

        Card[] deck = game.createDeck();
        for (Card card : deck) {
            System.out.println(card);
        }

        game.shuffleDeck(deck);
        System.out.println("\n Shuffled deck: ");
        for (Card card : deck) {
            System.out.println(card);
        }

        System.out.println("\nServe cards: ");
        game.serveDeck(deck);
    }
}
