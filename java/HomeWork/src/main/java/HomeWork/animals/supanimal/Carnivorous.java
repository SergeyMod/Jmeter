package HomeWork.animals.supanimal;

import HomeWork.food.Food;
import HomeWork.food.Grass;

public class Carnivorous extends Animal {

    @Override
    public void eat(Food food) {

        if (food instanceof Grass) {
            System.out.println( animal + " do not eat grass");
        } else {
            System.out.println(animal + " eat");
            satiety += food.getAddSatiety();
        }
    }
}