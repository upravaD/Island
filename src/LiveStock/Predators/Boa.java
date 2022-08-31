package LiveStock.Predators;

public class Boa extends Predator {

    public Boa() {
        super.setWeight(15);
        super.setMaxValueOnBoard(30);
        super.setSpeed(1);
        super.setFoolSaturation(3);
    }

    @Override
    public String getIcon() {
        return "\uD83D\uDC0D";
    }
}
