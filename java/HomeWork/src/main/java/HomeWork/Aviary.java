package HomeWork;

import HomeWork.animals.supanimal.Animal;

import java.util.HashSet;

public class Aviary<T> {

    private final Size SIZE = Size.HIGH;
    private final HashSet<T> AVIARY = new HashSet<>();

    public void addAnimal(T animal) {
        Animal d = (Animal) animal;
        if (d.getSize().getSize() <= this.SIZE.getSize()) {
            this.AVIARY.add(animal);
        }
    }

    public void dellAnimal(String name) {
        this.AVIARY.removeIf(x-> x.toString().equals(name));
    }

    public T getLink(String name) {
        return (T) this.AVIARY.stream().filter(x-> x.toString().equals(name)).toArray()[0];
    }

    public HashSet<T> getAviary() {
        return this.AVIARY;
    }
}

