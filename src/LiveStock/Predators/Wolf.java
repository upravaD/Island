package LiveStock.Predators;

public class Wolf extends Predator {

    public Wolf() {
        super.setWeight(50);
        super.setMaxValueOnBoard(30);
        super.setSpeed(3);
        super.setFoolSaturation(8);
    }

    @Override
    public String getIcon() {
        return null;
    }
}
