package Main;
import LiveStock.Plants;

public class Initialize implements Runnable {

    public String name = String.valueOf(Initialize.class);

    public Initialize() {
        System.out.println(name);
    }

    @Override
    public void run() {
        Plants plants = new Plants();
        plants.start();
        try {
            Thread.sleep(3000);
            plants.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
