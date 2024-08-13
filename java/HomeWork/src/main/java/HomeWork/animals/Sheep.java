package HomeWork.animals;

import HomeWork.Size;
import HomeWork.animals.supanimal.Herbivore;
import HomeWork.animals.doit.Run;
import HomeWork.animals.doit.Voice;

public class Sheep extends Herbivore implements Run, Voice {

    public Sheep(String name) {
        this.name = name;
    }

    {
        animal = "Sheep";
        size = Size.LOW;
    }

    public String run() {
        this.satiety--;
        return "The sheep is running";
    }

    public String voice() {
        this.satiety--;
        return "The sheep bleats";
    }
}