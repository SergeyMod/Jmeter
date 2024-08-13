package HomeWork.animals.supanimal;

import HomeWork.food.Food;
import HomeWork.food.Meat;

import java.util.Objects;

public class Herbivore extends Animal {

    @Override
    public void eat(Food food) {

        if (food instanceof Meat) {
            System.out.println(animal + " do not eat meat");
        } else {
            System.out.println(animal + " eat");
            satiety += food.getAddSatiety();
        }
    }

}