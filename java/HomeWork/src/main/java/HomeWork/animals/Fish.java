package HomeWork.animals;

import HomeWork.Size;
import HomeWork.animals.supanimal.Carnivorous;
import HomeWork.animals.doit.Swim;

public class Fish extends Carnivorous implements Swim {

    public Fish(String name) {
        this.name = name;
    }

    {
        animal = "Pike";
        size = Size.MEDIUM;
    }

    public String swim() {
        this.satiety--;
        return "The pike is swimming";
    }
}