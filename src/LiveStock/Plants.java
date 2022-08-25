package LiveStock;

public class Plants {

    public static Plants plant = new Plants();

    private Double weight;
    private final int maxPlantsOnBoard;

    public Plants() {
        this.weight = 1.0;
        this.maxPlantsOnBoard = 200;
    }

    public String getPlantIcon() {
        return "\u2618";
    }
}
