package Main;

public class Main {
    public static void main(String[] args) {
        Initialize initialize = new Initialize();
        initialize.run();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
