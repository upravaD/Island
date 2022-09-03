package LiveStock.Predators;

import java.util.List;

public class Boa extends Predator {

    public static Boa boa = new Boa();

    public Boa() {
        super.setWeight(15);
        super.setMaxValueOnBoard(30);
        super.setSpeed(1);
        super.setMaxFoodSaturation(3);
        super.setFoodSaturation(getMaxFoodSaturation()/2);
    }

    @Override
    public String getIcon() {
        return "\uD83D\uDC0D";
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
