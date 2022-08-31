package LiveStock.Predators;

public class Wolf extends Predator {

    public Wolf() {
        super.setWeight(50);
        super.setMaxValueOnBoard(30);
        super.setSpeed(3);
        super.setFoodSaturation(8);
    }

    @Override
    public String getIcon() {
        return "\uD83D\uDC3A";
    }
}
