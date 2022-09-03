package Main.Settings;

public class StatisticData {

    public static int plantBornCount = 0; // Кол-во растений
    public static int plantEatCount = 0; // Кол-во съеденых растений

    public static int herbivoresBornCount = 0; // Кол-во рожденных травоядных
    public static int herbivoresDeadCount = 0; // Кол-во погибших травоядных

    public static int predatorBornCount = 0; // Кол-во рожденных хищников
    public static int predatorEatingCount = 0; // Кол-во съеденных травоядных
    public static int predatorDeadCount = 0; // Кол-во погибших хищников


    public static void printData() {

        System.out.println(Color.MAGENTA_BRIGHT + "\n  < < - - - СТАТИСТИКА - - - > >\n");

        System.out.println(Color.WHITE_BRIGHT + "==================================\n");

        System.out.println(Color.BLUE_BRIGHT + "Симуляция длилась: "+ Color.WHITE_BRIGHT + Initialize.daysNumber/1000 + " дней\n");

        System.out.println(Color.GREEN_BRIGHT + "Всего появилось растений: " + Color.WHITE_BRIGHT + plantBornCount + " шт.");
        System.out.println(Color.GREEN_BRIGHT + "Всего съедено растений: " + Color.WHITE_BRIGHT + plantEatCount + " шт.\n");

        System.out.println(Color.YELLOW_BRIGHT + "Всего появилось травоядных: " + Color.WHITE_BRIGHT + herbivoresBornCount + " шт.");
        System.out.println(Color.YELLOW_BRIGHT + "Всего погибло травоядных : " + Color.WHITE_BRIGHT + herbivoresDeadCount + " шт.\n");

        System.out.println(Color.RED_BRIGHT + "Всего появилось хищников: " + Color.WHITE_BRIGHT + predatorBornCount + " шт.");
        System.out.println(Color.RED_BRIGHT + "Всего съедено травоядных: " + Color.WHITE_BRIGHT + predatorEatingCount + " шт.");
        System.out.println(Color.RED_BRIGHT + "Всего погибло хищников: " + Color.WHITE_BRIGHT + predatorDeadCount + " шт.");

        System.out.println(Color.WHITE_BRIGHT + "\n==================================");
    }
}
