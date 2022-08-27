package LiveStock.Herbivores;

import LiveStock.Animal.Animal;
import java.util.List;
//Класс поведения травоядных
public abstract class Herbivores extends Animal {

    public abstract void eat(List<Object> list);

    public abstract void move(List<Object> list);

    public void multiply() {

    }

    public void toDie() {

    }
}
