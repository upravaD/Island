package LiveStock.Herbivores;

import java.util.List;

public class Horse extends Herbivores {

    public Horse() {
        super.setWeight(400);
        super.setMaxValueOnBoard(20);
        super.setSpeed(4);
        super.setFoolSaturation(60);
    }

    @Override
    public void eat(List<Object> list) {

    }

    @Override
    public void move(List<Object> list) {

    }

    @Override
    public String getIcon() {
        return "\uD83D\uDC0E";
    }
}
