package LiveStock.Herbivores;

import java.util.List;

public class Goat extends Herbivores {

    public Goat() {
        super.setWeight(60);
        super.setMaxValueOnBoard(140);
        super.setSpeed(3);
        super.setFoolSaturation(15);
    }

    @Override
    public void eat(List<Object> list) {

    }

    @Override
    public void move(List<Object> list) {

    }

    @Override
    public String getIcon() {
        return "\uD83D\uDC10";
    }
}
