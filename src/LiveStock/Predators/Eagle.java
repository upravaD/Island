package LiveStock.Predators;

import java.util.List;

public class Eagle extends Predator {

    public static Eagle eagle = new Eagle();

    public Eagle() {
        super.setWeight(6);
        super.setMaxValueOnBoard(20);
        super.setSpeed(3);
        super.setMaxFoodSaturation(1);
        super.setFoodSaturation(getMaxFoodSaturation()/2);
    }

    @Override
    public String getIcon() {
        return "\uD83E\uDD85";
    }

    @Override
    public void eat(List<Object> list) {

    }

    @Override
    public void move(List<Object> list) {

    }

    @Override
    public void multiply() {

    }

    @Override
    public void toDie() {

    }
}
