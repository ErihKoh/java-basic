package learning.application;


public class Echo implements Command {
    private String text;
        
    Echo(String text) {
        this.text = text;
    }
        
    @Override
    public void execute() {
        System.out.println(text);
    }
}
