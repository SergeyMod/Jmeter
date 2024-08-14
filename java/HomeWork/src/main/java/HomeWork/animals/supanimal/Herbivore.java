package HomeWork.animals.supanimal;

import HomeWork.WrongFoodException;
import HomeWork.food.Food;
import HomeWork.food.Meat;

import java.util.Objects;

public class Herbivore extends Animal {

    @Override
    public void eat(Food food) throws WrongFoodException {

        if (food instanceof Meat) {
            throw new WrongFoodException(this.animal + " do not eat meat");
        } else {
            System.out.println(this.animal + " eat");
            satiety += food.getAddSatiety();
        }
    }

}