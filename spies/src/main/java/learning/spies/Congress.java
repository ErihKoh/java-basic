package learning.spies;

import java.util.ArrayList;
import java.util.List;


public class Congress implements Subject {
    private List<Observer> participants = new ArrayList<>();
    private List<String> secrets = new ArrayList<>();
    
    @Override
    public void addObserver(Observer observer) {
        participants.add(observer);
    }
    
    @Override
    public void removeObserver(Observer observer) {
        participants.remove(observer);
    }
    
    @Override
    public void notifyObservers(Message message) {
        for (Observer participant : participants) {
            participant.update(message);
        }
    }

    public void addItemForSecret(String item) {
        secrets.add(item);
    }

    public void Meeting() {
        for (String item : secrets) {
            Message message = new Message("Secret Item", item);
            notifyObservers(message);
        }
    }
   
}
