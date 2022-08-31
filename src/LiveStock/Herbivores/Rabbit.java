package LiveStock.Herbivores;

import LiveStock.Plants;
import Main.Island.CellPosition;
import Main.Island.Island;
import Main.Main;

import java.util.*;

public class Rabbit extends Herbivores {

    public static Rabbit rabbit = new Rabbit();

    public Rabbit() {
        super.setWeight(2);
        super.setMaxValueOnBoard(150);
        super.setSpeed(2);
        super.setFoodSaturation(0.45);
    }

    @Override
    public String getIcon() {
        return "🐇";
        // Алгоритм:
        // метод возвращает изображение обьекта rabbit
    }

    @Override
    public void eat(List<Object> list) {
//        int index = CellPosition.cellIndex(list);
//        for (int i = 0; i < list.size()-1; i++) {
//            if (list.get(i) instanceof Plants || list.get(i).equals(Plants.plant.getPlantIcon())) {
//                list.set(i, null);
//                list.remove(null);
//                super.setFoolSaturation(0.45);
//                System.out.println("Rabbit eat");
//            } else {
//                System.out.println("Rabbit not eat");
//                super.setFoolSaturation(rabbit.getFoolSaturation()-0.05);
//                move(list);
//                if (rabbit.getFoolSaturation() < 0.01) {
//                    list.set(i, null);
//                    list.remove(null);
//                    System.out.println("Rabbit dead");
//                }
//                System.out.println(rabbit.getFoolSaturation());
//            }
//        }
        if (list.contains(Plants.plant.getPlantIcon())) {
            list.remove(Plants.plant.getPlantIcon());
            super.setFoodSaturation(0.45);
            System.out.println("Rabbit eat");
            move(list);
        } else {
            super.setFoodSaturation(rabbit.getFoodSaturation() - 0.05);
            System.out.println("Rabbit not eat");
            move(list);
            if (rabbit.getFoodSaturation() < 0.01) {
                list.remove(rabbit.getIcon());
                System.out.println("Rabbit dead");
            }
            System.out.println(rabbit.getFoodSaturation());
        }
    }

        @Override
        public void move (List<Object> list) {
            //int index = CellPosition.cellIndex(list);
            int index = this.getCurrentPosition();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(rabbit.getIcon())) {
                    list.remove(list.get(i));
                    if (index == 8) {
                        CellPosition.changeCell(rabbit.getIcon(), 0);
                        System.out.println("Rabbit move 2");
                        this.setCurrentPosition(0);
                    } else {
                        CellPosition.changeCell(rabbit.getIcon(), index + 1);
                        System.out.println("Rabbit move");
                        this.setCurrentPosition(index + 1);
                    }
                }
            }
        }

        @Override
        public void multiply () {
            this.setCurrentPosition(Main.random.nextInt(9));
            CellPosition.changeCell(Main.factory.createAnimal(8).getIcon(), this.getCurrentPosition()); //(рандомный индекс < 9)
            // Алгоритм:
            // метод создает rabbit в списке массива island (индекс = 0)
        }

        @Override
        public void toDie () {

        }
    }
