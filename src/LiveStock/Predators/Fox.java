package LiveStock.Predators;

public class Fox extends Predator {

    public Fox() {
        super.setWeight(8);
        super.setMaxValueOnBoard(30);
        super.setSpeed(2);
        super.setFoodSaturation(2);
    }

    @Override
    public String getIcon() {
        return "\uD83E\uDD8A";
    }
}
