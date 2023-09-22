package learning.application;


public class Application {

    public static void main(String[] args) {
        Command command;
        if (args == null || args.length == 0) {
            System.out.println("Error");
        } else {
            switch (args[0]) {
                case "help": {
                    if (args.length == 1 && args[0].equals("help")) {
                        command = new Help();
                        command.execute();
                    } else System.out.println("Error");
                    break;
                }
                case "echo": {
                    if (args.length == 2 && args[0].equals("echo")) {
                        command = new Echo(args[1]);
                        command.execute();
                    } else System.out.println("Error");
                    break;
                }  
                case "date": {
                    if (args.length == 1 && args[0].equals("now")) {
                        command = new DateNow();
                        command.execute();
                    } else System.out.println("Error");
                    break;
                }
                case "exit": {
                    if (args.length == 1 && args[0].equals("exit")) {
                        command = new Exit();
                        command.execute();
                    } else System.out.println("Error");
                    break;
                }
                
                default: {
                    System.out.println("Error");
                }
            }
        }
    }
}
