//Тигр
package HomeWork2.animals;

import HomeWork2.animals.supanimal.Carnivorous;
import HomeWork2.animals.doit.Run;
import HomeWork2.animals.doit.Voice;

public class Tiger extends Carnivorous implements Run, Voice {
    public String run() {return "The tiger is running";}

    public String voice() {return "The tiger roars";}
}