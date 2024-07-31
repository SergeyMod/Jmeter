package animals.supanimal;

import food.*;

public abstract class Carnivorous extends Animal {

    public void eat(Food food) {

        if (food instanceof Grass) {

            System.out.println("Carnivorous do not eat grass");
        }
        else {
            System.out.println("Eat");
        }
    }
}