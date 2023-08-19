package lambda;

public class LambdaTest {

    public static void main(String[] args) {
        func1();
    }

    public static void func1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runable thread ...");
            }
        }).start();

        new Thread(() -> {
            System.out.println("lambda thread...");
        }).start();
    }
}
