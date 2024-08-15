package HomeWork.animals;

import HomeWork.animals.supanimal.Herbivore;
import HomeWork.animals.doit.Run;
import HomeWork.animals.doit.Voice;

public class Sheep extends Herbivore implements Run, Voice {

    {
        animal = "Sheep";
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