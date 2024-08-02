package HomeWork2;
import HomeWork2.animals.*;
import HomeWork2.food.*;
import HomeWork2.worker.Worker;


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