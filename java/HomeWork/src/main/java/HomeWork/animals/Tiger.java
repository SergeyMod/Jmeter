package HomeWork.animals;

import HomeWork.animals.supanimal.Carnivorous;
import HomeWork.animals.doit.Run;
import HomeWork.animals.doit.Voice;

public class Tiger extends Carnivorous implements Run, Voice {

    {
        animal = "Tiger";
    }

    public String run() {
        this.satiety--;
        return "The tiger is running";
    }

    public String voice() {
        this.satiety--;
        return "The tiger roars";
    }
}