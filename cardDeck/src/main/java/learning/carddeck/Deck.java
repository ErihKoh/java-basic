
package learning.carddeck;

public class Deck {
    
    private static final int CARDS_COUNT = 36;
    public int cardNumber = 0;
    
    public Card[] cards_deck = new Card[CARDS_COUNT];

    public Deck() {
        for (int i = 0; i < Rank.values.length; i += 1) {
            for (int j = 0; j < Suit.values.length; j += 1) {
                cards_deck[cardNumber] = new Card(Rank.values[i], Suit.values[j]);
                cardNumber+=1;
            }
        }
    }
    
    
    //Перемішує колоду у випадковому порядку 
    public void shuffle() {
        for (int i = cards_deck.length - 1; i > 0; i--) {
            int j = (int) Math.floor(Math.random() * (i + 1));
            
            Card temp = cards_deck[i];
            cards_deck[i] = cards_deck[j];
            cards_deck[j] = temp;
        
        }
    }
    /* * Впорядкування колоди за мастями та значеннями 
    * Порядок сотрування: 
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES 
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6 
    * Наприклад 
    * HEARTS Ace 
    * HEARTS King 
    * HEARTS Queen 
    * HEARTS Jack 
    * HEARTS 10 
    * HEARTS 9 
    * HEARTS 8 
    * HEARTS 7 
    * HEARTS 6 
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
    }
    
    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        return false;
    }
    
    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        return null;
    } 
}
