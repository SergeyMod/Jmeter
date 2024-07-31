package worker;

import animals.supanimal.Animal;
import food.Food;
import animals.doit.Voice;

public class Worker {

    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }
}