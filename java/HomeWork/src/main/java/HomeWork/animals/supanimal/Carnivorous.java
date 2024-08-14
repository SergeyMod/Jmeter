package HomeWork.animals.supanimal;

import HomeWork.WrongFoodException;
import HomeWork.food.Food;
import HomeWork.food.Grass;

import java.util.Objects;

public class Carnivorous extends Animal {

    @Override
    public void eat(Food food) throws WrongFoodException {

        if (food instanceof Grass) {
            throw new WrongFoodException(this.animal + " do not eat meat");
        } else {
            System.out.println(this.animal + " eat");
            satiety += food.getAddSatiety();
        }
    }

}