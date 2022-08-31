package LiveStock.Herbivores;

import java.util.List;

public class Buffalo extends Herbivores {

    public Buffalo() {
        super.setWeight(700);
        super.setMaxValueOnBoard(10);
        super.setSpeed(3);
        super.setFoodSaturation(100);
    }

    @Override
    public void eat(List<Object> list) {

    }

    @Override
    public void move(List<Object> list) {

    }

    @Override
    public String getIcon() {
        return "\uD83D\uDC03";
    }
}
