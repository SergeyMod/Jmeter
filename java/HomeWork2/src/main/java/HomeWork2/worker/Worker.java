package HomeWork2.worker;

import HomeWork2.animals.supanimal.Animal;
import HomeWork2.food.Food;
import HomeWork2.animals.doit.Voice;

public class Worker {

    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }
}