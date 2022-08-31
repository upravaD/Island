package LiveStock.Animal;

public abstract class Animal {

    private double weight; // Вес
    private int maxValueOnBoard; // Максимальное кол-во обьектов на карте
    private int speed; // Скорость
    private double foodSaturation; // насыщение пищей
    private int currentPosition; // текущая позиция элемента в массиве island

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

    public double getFoodSaturation() {
        return foodSaturation;
    }
    public void setFoodSaturation(double foodSaturation) {
        this.foodSaturation = foodSaturation;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}

