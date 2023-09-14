package learning.carddeck;

public enum Rank {
    ACE("Ace"),
    KING("King"),
    QUEEN("Queen"),
    JACK("Jack"),
    TEN("10"),
    NINE("9"),
    EIGHT("8"),
    SEVEN("7"),
    SIX("6");

    public static Rank[] values = Rank.values();

    private final String name;

    Rank(String name) {
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
