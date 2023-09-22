package learning.application;


public class DateNow implements Command {
    @Override
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}
