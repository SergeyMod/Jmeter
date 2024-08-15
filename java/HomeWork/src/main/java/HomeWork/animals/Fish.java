package HomeWork.animals;

import HomeWork.animals.supanimal.Carnivorous;
import HomeWork.animals.doit.Swim;

public class Fish extends Carnivorous implements Swim {

    {
        animal = "Pike";
    }

    public String swim() {
        this.satiety--;
        return "The pike is swimming";
    }
}