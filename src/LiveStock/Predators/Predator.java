package LiveStock.Predators;

import LiveStock.Animal.Animal;
import java.util.List;

//Класс поведения хищников
public abstract class Predator extends Animal {

    public abstract void eat(List<Object> list);

    public abstract void move(List<Object> list);

    public abstract void multiply();

    public abstract void toDie();

}