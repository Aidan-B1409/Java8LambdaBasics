package src.main;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });
        Thread myLambdaThread = new Thread(() -> System.out.println("Hello World!"));

        myLambdaThread.run();
        myThread.run();
    }
}
