//Лев
package HomeWork2.animals;

import HomeWork2.animals.supanimal.Carnivorous;
import HomeWork2.animals.doit.Run;
import HomeWork2.animals.doit.Voice;

public class Lion extends Carnivorous implements Run, Voice {
    public String run() { return "The cow is running";}

    public String voice() {return "The lion roars";}
}