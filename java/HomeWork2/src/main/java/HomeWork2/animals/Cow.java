//Корова
package HomeWork2.animals;

import HomeWork2.animals.supanimal.Herbivore;
import HomeWork2.animals.doit.Run;
import HomeWork2.animals.doit.Voice;

public class Cow extends Herbivore implements Run, Voice {

    public String run() {return "The cow is running";}

    public String voice() {return "The cow is mooing";}
}