package HomeWork.worker;

import HomeWork.animals.supanimal.Animal;
import HomeWork.food.Food;
import HomeWork.animals.doit.Voice;

public class Worker {

    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }
}