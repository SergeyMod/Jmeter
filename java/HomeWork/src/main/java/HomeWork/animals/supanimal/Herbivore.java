package HomeWork.animals.supanimal;

import HomeWork.food.*;

public abstract class Herbivore extends Animal {

    public void eat(Food food) {

        if (food instanceof Meat) {

            System.out.println("Herbivore do not eat meat");
        }
        else {
            System.out.println("Eat");
        }
    }
}