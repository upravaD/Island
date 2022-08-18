package Main;
import LiveStock.Herbivores.Rabbit;
import LiveStock.Plants;

public class Initialize extends Thread {

    public String name = Initialize.class.getSimpleName();

    public Initialize() {
        System.out.println(name);
    }

    @Override
    public void run() {
        Plants plants = new Plants();
        plants.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            plants.interrupt();
        }

//        Rabbit rabbit = new Rabbit();
//        rabbit.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            rabbit.interrupt();
//        }
    }

}
