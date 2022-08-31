package LiveStock.Herbivores;

import java.util.List;

public class Sheep extends Herbivores {

    public Sheep() {
        super.setWeight(70);
        super.setMaxValueOnBoard(140);
        super.setSpeed(3);
        super.setFoodSaturation(15);
    }

    @Override
    public void eat(List<Object> list) {

    }

    @Override
    public void move(List<Object> list) {

    }

    @Override
    public String getIcon() {
        return "\uD83D\uDC11";
    }
}
