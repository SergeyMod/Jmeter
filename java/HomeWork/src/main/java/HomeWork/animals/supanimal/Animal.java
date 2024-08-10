package HomeWork.animals.supanimal;

import HomeWork.food.Food;

public abstract class Animal {

    protected String animal = "Animal";
    protected int satiety = 5;

    public abstract void eat(Food food);

    public int getSatiety() {
        return satiety;
    }
}