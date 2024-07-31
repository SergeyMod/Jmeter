import animals.*;
import food.*;
import worker.Worker;

public class Zoo {

    public static void main(String[] args) {

        Cow cow = new Cow();
        Duck duck = new Duck();
        Grass grass = new Grass();
        Meat meat = new Meat();
        Worker worker = new Worker();

        worker.feed(duck, meat);
        worker.getVoice(duck);

    }
}