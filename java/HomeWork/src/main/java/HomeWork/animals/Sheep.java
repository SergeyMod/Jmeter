//Овца
package HomeWork.animals;

import HomeWork.animals.supanimal.Herbivore;
import HomeWork.animals.doit.Run;
import HomeWork.animals.doit.Voice;

public class Sheep extends Herbivore implements Run, Voice {
    public String run() {return "The sheep is running";}

    public String voice() {return "The sheep bleats";}
}