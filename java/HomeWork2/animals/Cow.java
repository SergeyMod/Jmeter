//Корова
package animals;

import animals.supanimal.Herbivore;
import animals.doit.Run;
import animals.doit.Voice;

public class Cow extends Herbivore implements Run, Voice {

    public String run() {return "The cow is running";}

    public String voice() {return "The cow is mooing";}
}