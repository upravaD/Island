package Main.Settings;

public class StatisticData {

    public static int plantEatCount = 0; // Кол-во съеденых растений

    public static void printData() {
        System.out.println("\n-----СТАТИСТИКА-----");
        System.out.println("=====================\n");
        System.out.println("Симуляция длилась: " + Initialize.daysNumber/1000 + " дней");
        System.out.println("Всего съедено растений: " + plantEatCount + " шт.");
        System.out.println("=====================\n");
    }
}
