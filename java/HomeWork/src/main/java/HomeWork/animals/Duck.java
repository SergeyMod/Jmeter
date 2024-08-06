
package HomeWork.animals;

import HomeWork.animals.supanimal.Herbivore;
import HomeWork.animals.doit.Swim;
import HomeWork.animals.doit.Voice;
import HomeWork.animals.doit.Fly;

public class Duck extends Herbivore implements Swim, Fly, Voice {

    public String swim() {return "The swim is swimming";}

    public String fly() {return "The duck is flying";}

    public String voice() {return "The duck quacks";}
}