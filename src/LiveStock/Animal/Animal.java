package LiveStock.Animal;

public abstract class Animal {

    private double weight;
    private int maxValueOnBoard;
    private int speed;
    private double foolSaturation;

//    public abstract void eat();
//    public abstract void move();
//    public abstract void multiply();
//    public abstract void toDie();
    public abstract String getIcon();

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxValueOnBoard() {
        return maxValueOnBoard;
    }
    public void setMaxValueOnBoard(int maxValueOnBoard) {
        this.maxValueOnBoard = maxValueOnBoard;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFoolSaturation() {
        return foolSaturation;
    }
    public void setFoolSaturation(double foolSaturation) {
        this.foolSaturation = foolSaturation;
    }
}

