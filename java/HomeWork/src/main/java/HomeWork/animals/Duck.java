package HomeWork.animals;

import HomeWork.Size;
import HomeWork.animals.supanimal.Herbivore;
import HomeWork.animals.doit.Swim;
import HomeWork.animals.doit.Voice;
import HomeWork.animals.doit.Fly;

public class Duck extends Herbivore implements Swim, Fly, Voice {

    public Duck(String name) {
        this.name = name;
    }

    {
        animal = "Duck";
        size = Size.LOW;
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