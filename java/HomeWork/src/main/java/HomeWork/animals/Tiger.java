package HomeWork.animals;

import HomeWork.animals.supanimal.Carnivorous;
import HomeWork.animals.doit.Run;
import HomeWork.animals.doit.Voice;

public class Tiger extends Carnivorous implements Run, Voice {
    public String run() {
        return "The tiger is running";
    }

    public String voice() {
        return "The tiger roars";
    }
}