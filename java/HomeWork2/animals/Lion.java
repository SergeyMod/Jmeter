//Лев
package animals;

import animals.supanimal.Carnivorous;
import animals.doit.Run;

public class Lion extends Carnivorous implements Run, Voice {
    public String run() { return "The cow is running";}

    public String voice() {return "The lion roars";}
}