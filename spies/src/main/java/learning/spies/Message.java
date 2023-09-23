package learning.spies;


public class Message {
    private String type;
    private String data;

    public Message(String type, String data) {
        this.type = type;
        this.data = data;
    }

   
    public String getData() {
        return data;
    }
}

