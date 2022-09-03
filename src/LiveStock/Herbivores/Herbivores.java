package LiveStock.Herbivores;

import LiveStock.Animal.Animal;
import java.util.List;

//Класс поведения травоядных
public abstract class Herbivores extends Animal {

    public abstract void eat(List<java.lang.Object> list);

    public abstract void move(List<java.lang.Object> list);

    public abstract void multiply();

    public abstract void toDie();
}
