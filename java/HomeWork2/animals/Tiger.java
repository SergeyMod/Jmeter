//Тигр
package animals;

import animals.supanimal.Carnivorous;
import animals.doit.Run;

public class Tiger extends Carnivorous implements Run, Voice {
    public String run() {return "The tiger is running";}

    public String voice() {return "The tiger roars";}
}