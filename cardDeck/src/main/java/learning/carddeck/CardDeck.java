package learning.carddeck;
import java.util.Arrays;

public class CardDeck {
    public static Deck deck = new Deck();
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(deck.cards_deck));

        deck.shuffle();
          
        System.out.println(Arrays.toString(deck.cards_deck));  
        
    }
}
