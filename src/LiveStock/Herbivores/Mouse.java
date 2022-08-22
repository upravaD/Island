package LiveStock.Herbivores;

public class Mouse extends Herbivores {

    public Mouse() {
        super.setWeight(0.05);
        super.setMaxValueOnBoard(500);
        super.setSpeed(1);
        super.setFoolSaturation(0.01);
    }
}
