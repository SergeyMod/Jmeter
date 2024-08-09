package HomeWork.animals;

import HomeWork.animals.supanimal.Herbivore;
import HomeWork.animals.doit.Run;
import HomeWork.animals.doit.Voice;

public class Cow extends Herbivore implements Run, Voice {

    public String run() {
        return "The cow is running";
    }

    public String voice() {
        return "The cow is mooing";
    }
}