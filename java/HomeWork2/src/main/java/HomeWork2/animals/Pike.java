//Щука
package HomeWork2.animals;

import HomeWork2.animals.supanimal.Carnivorous;
import HomeWork2.animals.doit.Swim;

public class Pike extends Carnivorous implements Swim {
    public String swim() {  return "The pike is swimming";}
}