package HomeWork.animals;

import HomeWork.Size;
import HomeWork.animals.supanimal.Carnivorous;
import HomeWork.animals.doit.Run;
import HomeWork.animals.doit.Voice;

public class Lion extends Carnivorous implements Run, Voice {

    public Lion(String name) {
        this.name = name;
    }

    {
        animal = "Lion";
        size = Size.MEDIUM;
    }

    public String run() {
        this.satiety--;
        return "The cow is running";
    }

    public String voice() {
        this.satiety--;
        return "The lion roars";
    }
}