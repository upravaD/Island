package LiveStock;

public class Plants {

    private int weight;
    private int maxValueOnBoard;

    public Plants() {
        this.weight = 1;
        this.maxValueOnBoard = 200;
    }
    public Plants toBorn() {
        return new Plants();
    }
    public void toDie() {
        System.out.println("Plant die");
    }
}
