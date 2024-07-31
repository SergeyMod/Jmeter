//Овца
package animals;

import animals.supanimal.Herbivore;
import animals.doit.Run;

public class Sheep extends Herbivore implements Run, Voice {
    public String run() {return "The sheep is running";}

    public String voice() {return "The sheep bleats";}
}