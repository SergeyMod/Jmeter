package HomeWork.animals;

import HomeWork.Size;
import HomeWork.animals.supanimal.Herbivore;
import HomeWork.animals.doit.Run;
import HomeWork.animals.doit.Voice;

public class Cow extends Herbivore implements Run, Voice {

    public Cow(String name) {
        this.name = name;
    }

    {
        animal = "Cow";
        size = Size.MEDIUM;
    }

    public String run() {
        this.satiety--;
        return "The cow is running";
    }

    public String voice() {
        this.satiety--;
        return "The cow is mooing";
    }
}