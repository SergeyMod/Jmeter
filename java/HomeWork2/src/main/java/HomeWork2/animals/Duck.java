//Утка
package HomeWork2.animals;

import HomeWork2.animals.supanimal.Herbivore;
import HomeWork2.animals.doit.Swim;
import HomeWork2.animals.doit.Voice;
import HomeWork2.animals.doit.Fly;

public class Duck extends Herbivore implements Swim, Fly, Voice {

    public String swim() {return "The swim is swimming";}

    public String fly() {return "The duck is flying";}

    public String voice() {return "The duck quacks";}
}