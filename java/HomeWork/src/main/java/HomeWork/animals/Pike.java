package HomeWork.animals;

import HomeWork.animals.supanimal.Carnivorous;
import HomeWork.animals.doit.Swim;

public class Pike extends Carnivorous implements Swim {
    public String swim() {
        return "The pike is swimming";
    }
}