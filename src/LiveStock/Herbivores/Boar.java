package LiveStock.Herbivores;

import java.util.List;

public class Boar extends Herbivores {

    public Boar() {
        super.setWeight(400);
        super.setMaxValueOnBoard(50);
        super.setSpeed(2);
        super.setFoodSaturation(50);
    }

    @Override
    public void eat(List<Object> list) {

    }

    @Override
    public void move(List<Object> list) {

    }

    @Override
    public String getIcon() {
        return "🐗";
    }
}
