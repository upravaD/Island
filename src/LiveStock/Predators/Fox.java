package LiveStock.Predators;

import java.util.List;

public class Fox extends Predator {

    public static Fox fox = new Fox();

    public Fox() {
        super.setWeight(8);
        super.setMaxValueOnBoard(30);
        super.setSpeed(2);
        super.setMaxFoodSaturation(2);
        super.setFoodSaturation(getMaxFoodSaturation()/2);
    }

    @Override
    public String getIcon() {
        return "\uD83E\uDD8A";
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
