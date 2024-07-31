//Щука
package animals;

import animals.supanimal.Carnivorous;
import animals.doit.Swim;

public class Pike extends Carnivorous implements Swim {
    public String swim() {  return "The pike is swimming";}
}