package HomeWork.animals.supanimal;

import HomeWork.Size;
import HomeWork.WrongFoodException;
import HomeWork.food.Food;

import java.util.Objects;

public abstract class Animal {

    protected String animal;
    protected int satiety = 5;
    protected String name;
    protected Size size;

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Animal) obj).getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {return this.name;}

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {return this.size;}

    public abstract void eat(Food food) throws WrongFoodException;

    public int getSatiety() {
        return satiety;
    }
}