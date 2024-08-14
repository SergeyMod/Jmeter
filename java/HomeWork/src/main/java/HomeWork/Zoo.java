package HomeWork;

import HomeWork.animals.*;
import HomeWork.animals.supanimal.Carnivorous;
import HomeWork.animals.supanimal.Herbivore;


public class Zoo {

    public static void main(String[] args) {

        Cow cow = new Cow("Вася");
        Cow cow2 = new Cow("Буренка");
        Lion lion = new Lion("Симон");
        Sheep sheep = new Sheep("Шерстяная");
        Duck duck = new Duck("Утка");
        Fish pike = new Fish("Щука");
        Tiger tiger = new Tiger("Шрам");


        Aviary<Herbivore> aviaryHerbivore = new Aviary<>();
        aviaryHerbivore.addAnimal(cow);
        aviaryHerbivore.addAnimal(sheep);
        aviaryHerbivore.addAnimal(duck);
        aviaryHerbivore.addAnimal(cow2);

        System.out.println(aviaryHerbivore.getAviary());
        aviaryHerbivore.dellAnimal(cow.getName());
        System.out.println(aviaryHerbivore.getAviary());
        System.out.println(aviaryHerbivore.getLink(duck.getName()).getClass());

        Aviary<Carnivorous> aviaryCarnivorous = new Aviary<>();
        aviaryCarnivorous.addAnimal(pike);
        aviaryCarnivorous.addAnimal(tiger);
        aviaryCarnivorous.addAnimal(pike);
        aviaryCarnivorous.addAnimal(lion);

    }
}