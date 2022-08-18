package Main;

public class Main {
    public static void main(String[] args) {
        Initialize initialize = new Initialize();
        initialize.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            initialize.interrupt();
        }
    }
}
