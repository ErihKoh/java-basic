package learning.spies;



public class Spies {

    public static void main(String[] args) {
        Agency agency = new Agency();

        Spy spy1 = new Spy("Spy 1");
        Spy spy2 = new Spy("Spy 2");
        Spy spy3 = new Spy("Spy 3");

        agency.addObserver(spy1);
        agency.addObserver(spy2);
        agency.addObserver(spy3);

        Congress congress = new Congress();
        congress.addObserver(spy1);
        congress.addObserver(spy2);
        congress.addObserver(spy3);
        congress.addItemForSecret("Expand the ranks");
        congress.addItemForSecret("Money laundering methods");
        congress.addItemForSecret("New sources of bribes");

        congress.Meeting();

        spy1.compromiseSpy();

        congress.Meeting();
    }
}
