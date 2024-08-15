package HomeWork.animals;

import HomeWork.animals.supanimal.Herbivore;
import HomeWork.animals.doit.Swim;
import HomeWork.animals.doit.Voice;
import HomeWork.animals.doit.Fly;

public class Duck extends Herbivore implements Swim, Fly, Voice {

    {
        animal = "Duck";
    }

    public String swim() {
        this.satiety--;
        return "The duck is swimming";
    }

    public String fly() {
        this.satiety--;
        return "The duck is flying";
    }

    public String voice() {
        this.satiety--;
        return "The duck quacks";
    }
}