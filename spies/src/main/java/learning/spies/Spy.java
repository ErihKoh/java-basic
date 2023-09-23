package learning.spies;


public class Spy implements Observer {
    private String name;
    private boolean isActive = true;

    public Spy(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {
        if (isActive) System.out.println("Spy " + name + " received information: " + message.getData());
        
        else System.out.println("Spy " + name + " has been compromised and cannot receive information.");
    }

    public void compromiseSpy() {
        isActive = false;
    }
}

