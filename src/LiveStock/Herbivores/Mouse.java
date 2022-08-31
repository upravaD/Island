package LiveStock.Herbivores;

import java.util.List;

public class Mouse extends Herbivores {

    public Mouse() {
        super.setWeight(0.05);
        super.setMaxValueOnBoard(500);
        super.setSpeed(1);
        super.setFoolSaturation(0.01);
    }

    @Override
    public void eat(List<Object> list) {

    }

    @Override
    public void move(List<Object> list) {

    }

    @Override
    public String getIcon() {
        return "\uD83D\uDC01";
    }
}
