package LiveStock.Predators;

public class Bear extends Predator {

    public Bear() {
        super.setWeight(500);
        super.setMaxValueOnBoard(5);
        super.setSpeed(2);
        super.setFoolSaturation(80);
    }
}
