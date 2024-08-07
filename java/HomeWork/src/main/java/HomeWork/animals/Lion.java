package HomeWork.animals;

import HomeWork.animals.supanimal.Carnivorous;
import HomeWork.animals.doit.Run;
import HomeWork.animals.doit.Voice;

public class Lion extends Carnivorous implements Run, Voice {
    public String run() {
        return "The cow is running";
    }

    public String voice() {
        return "The lion roars";
    }
}