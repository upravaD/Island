package LiveStock.Animal;

public abstract class Animal {

    private double weight; // Вес
    private int maxValueOnBoard; // Максимальное кол-во обьектов на карте
    private int speed; // Скорость
    private double foodSaturation; // Текущее насыщение пищей
    private double maxFoodSaturation; // Максимальное насыщение пищей
    private int currentPosition; // Текущая позиция элемента в массиве island

    public abstract String getIcon();

    public double getMaxFoodSaturation() {
        return maxFoodSaturation;
    }
    public void setMaxFoodSaturation(double maxFoodSaturation) {
        this.maxFoodSaturation = maxFoodSaturation;
    }

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

