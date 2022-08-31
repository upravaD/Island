package LiveStock.Herbivores;

import java.util.List;

public class Duck extends Herbivores {

    public Duck() {
        super.setWeight(1);
        super.setMaxValueOnBoard(200);
        super.setSpeed(4);
        super.setFoolSaturation(0.15);
    }

    @Override
    public void eat(List<Object> list) {

    }

    @Override
    public void move(List<Object> list) {

    }

    @Override
    public String getIcon() {
        return "\uD83E\uDD86";
    }
}
