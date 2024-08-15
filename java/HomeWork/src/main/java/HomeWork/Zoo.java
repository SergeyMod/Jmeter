package HomeWork;

import HomeWork.animals.*;
import HomeWork.animals.doit.Swim;
import HomeWork.food.Grass;
import HomeWork.food.Meat;
import HomeWork.worker.Worker;


public class Zoo {

    public static void main(String[] args) {

        Cow cow = new Cow();
        Lion lion = new Lion();
        Duck duck = new Duck();
        Fish pike = new Fish();
        Sheep sheep = new Sheep();
        Tiger tiger = new Tiger();

        Grass grass = new Grass();
        Meat meat = new Meat();

        Worker worker = new Worker();

        worker.feed(lion, meat);
        worker.feed(lion, grass);
        worker.feed(sheep, meat);
        worker.feed(sheep, grass);
        worker.getVoice(lion);
        //worker.getVoice(pike);

        Swim[] pond = {new Duck(), new Duck(), new Fish(), new Fish(), new Duck()};
        for (Swim it : pond) {
            System.out.println(it.swim());
        }
    }
}