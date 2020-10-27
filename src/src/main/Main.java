package src.main;

public class Main {
    public void run (Command command){
        command.run();
    }
    public static void main(String[] args) {
        Main main = new Main();
        Command command = () -> System.out.println("Drive Forward 15 Feet");
        main.run(command);
    }
}


