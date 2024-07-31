//Утка
package animals;

import animals.supanimal.Herbivore;
import animals.doit.Swim;
import animals.doit.Voice;
import animals.doit.Fly;

public class Duck extends Herbivore implements Swim, Fly, Voice {

    public String swim() {return "The swim is swimming";}

    public String fly() {return "The duck is flying";}

    public String voice() {return "The duck quacks";}
}