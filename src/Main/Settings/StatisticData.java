package Main.Settings;

public class StatisticData {

    public static int plantBornCount = 0; // Кол-во растений
    public static int plantEatCount = 0; // Кол-во съеденых растений

    public static int caterpillarBornCount = 0; // Кол-во гусениц
    public static int caterpillarEatCount = 0; // Кол-во съеденных гусениц

    public static int herbivoresBornCount = 0; // Кол-во съеденных гусениц
    public static int herbivoresDeadCount = 0; // Кол-во съеденных гусениц

    public static int predatorBornCount = 0; // Кол-во съеденных гусениц
    public static int predatorDeadCount = 0; // Кол-во съеденных гусениц


    public static void printData() {

        System.out.println("\n-----СТАТИСТИКА-----");

        System.out.println("=====================");

        System.out.println("Симуляция длилась: " + Initialize.daysNumber/1000 + " дней\n");

        System.out.println("Всего появилось растений: " + plantBornCount + " шт.");
        System.out.println("Всего съедено растений: " + plantEatCount + " шт.\n");

//        System.out.println("Всего появилось гусениц: " + caterpillarBornCount + " шт.");
//        System.out.println("Всего съедено гусениц: " + caterpillarEatCount + " шт.\n");

        System.out.println("Всего появилось травоядных: " + herbivoresBornCount + " шт.");
        System.out.println("Всего погибло травоядных : " + herbivoresDeadCount + " шт.\n");

        System.out.println("Всего появилось хищников: " + predatorBornCount + " шт.");
        System.out.println("Всего погибло хищников: " + predatorDeadCount + " шт.");

        System.out.println("=====================\n");
    }
}
