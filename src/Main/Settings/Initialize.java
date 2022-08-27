package Main.Settings;

//Класс реализации потоков
public class Initialize extends Thread {

    public String name = Initialize.class.getSimpleName();

    public Initialize() {
        System.out.println(name);
    }

    @Override
    public void run() {

    }

}
