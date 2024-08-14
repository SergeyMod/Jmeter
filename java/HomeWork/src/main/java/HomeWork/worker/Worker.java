package HomeWork.worker;

import HomeWork.WrongFoodException;
import HomeWork.animals.supanimal.Animal;
import HomeWork.food.Food;
import HomeWork.animals.doit.Voice;

public class Worker {

    public void feed(Animal animal, Food food) {
        try {
            animal.eat(food);
        } catch (WrongFoodException e) {
            System.out.println(e.getMessage());
        }

    }

    public void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }
}