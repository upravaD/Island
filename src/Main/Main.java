package Main;

import LiveStock.Plants;

import java.lang.management.PlatformLoggingMXBean;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        String console = "start";
//        ScheduledExecutorService executorService = null;
//        executorService = Executors.newScheduledThreadPool(64);
//        executorService.scheduleAtFixedRate(new Initialize(), 0, 2, TimeUnit.SECONDS);

//        Scanner scanner = new Scanner(System.in);
//        String console = scanner.nextLine();
//        if (console.equalsIgnoreCase("start")) {
//            executorService = Executors.newScheduledThreadPool(64);
//            executorService.scheduleAtFixedRate(new Initialize(), 0, 2, TimeUnit.SECONDS);
//            Thread.sleep(14000);
//            executorService.shutdown();
//        }
        Plants plants = new Plants();
        boolean res = true;
        while (res) {
            plants.run();
            if (plants.getWeight() > plants.getMaxPlantsOnBoard()) break;
        }
    }
}
