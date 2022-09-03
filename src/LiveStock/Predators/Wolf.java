package LiveStock.Predators;

import java.util.List;

public class Wolf extends Predator {

    public static Wolf wolf = new Wolf();

    public Wolf() {
        super.setWeight(50);
        super.setMaxValueOnBoard(30);
        super.setSpeed(3);
        super.setMaxFoodSaturation(8);
        super.setFoodSaturation(getMaxFoodSaturation()/2);
    }

    @Override
    public String getIcon() {
        return "\uD83D\uDC3A";
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
