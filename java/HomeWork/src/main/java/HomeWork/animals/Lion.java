package HomeWork.animals;

import HomeWork.animals.supanimal.Carnivorous;
import HomeWork.animals.doit.Run;
import HomeWork.animals.doit.Voice;

public class Lion extends Carnivorous implements Run, Voice {

    {
        animal = "Lion";
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