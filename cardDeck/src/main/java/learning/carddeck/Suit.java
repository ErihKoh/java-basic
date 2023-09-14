
package learning.carddeck;

public enum Suit {
    HEARTS("HEARTS"),
    DIAMONDS("DIAMONDS"),
    CLUBS("CLUBS"),
    SPADES("SPADES");
	
    public static Suit[] values = Suit.values();
	
    private final String name;

    Suit(String name) {
        this.name = name;
    }

    public String getName() {
	return name;
    }
    
    @Override
    public String toString() {
        return getName();
   }
}
