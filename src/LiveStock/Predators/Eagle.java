package LiveStock.Predators;

public class Eagle extends Predator {

    public Eagle() {
        super.setWeight(6);
        super.setMaxValueOnBoard(20);
        super.setSpeed(3);
        super.setFoodSaturation(1);
    }

    @Override
    public String getIcon() {
        return "\uD83E\uDD85";
    }
}
