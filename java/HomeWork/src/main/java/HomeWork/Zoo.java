package HomeWork;
import HomeWork.animals.*;
import HomeWork.food.*;
import HomeWork.worker.Worker;


public class Zoo {

    public static void main(String[] args) {

        Lion lion = new Lion();
        Duck duck = new Duck();
        Grass grass = new Grass();
        Meat meat = new Meat();
        Worker worker = new Worker();

        worker.feed(lion, meat);
        worker.getVoice(duck);

    }
}