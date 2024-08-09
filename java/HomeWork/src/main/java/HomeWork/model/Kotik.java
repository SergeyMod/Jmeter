package HomeWork.model;

import java.util.Random;

public class Kotik {

    private static int count;
    
    private int satiety = 30; 
    private String name;
    private int prettiness;
    private int weight;
    private String meow;

    public Kotik() {

    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        setKotik(prettiness, name, weight, meow);
    }

    {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return this.name;
    }

    public int getPrettiness() {
        return this.prettiness;
    }

    public String getMeow() {
        return this.meow;
    }

    public int getWeight() {
        return this.weight;
    }

    public void liveAnotherDay() {
        Random rnd = new Random();
        for (int i = 1; i <= 24; i++) {
            int temp = rnd.nextInt(5);
            switch (temp) {
                case 0:
                    if (!play()) {
                        eat();
                    }
                    break;
                case 1:
                    if (!sleep()) {
                        eat();
                    }
                    break;
                case 2:
                    if (!chaseMouse()) {
                        eat();
                    }
                    break;
                case 3:
                    if (!lay()) {
                        eat();
                    }
                    break;
                case 4:
                    if (!sit()) {
                        eat();
                    }
            }
        }
    }

    public boolean play() {
        boolean isEatKot = isEat();
        if (isEatKot) {
            System.out.println("Кот " + this.name + " играет.");
            this.satiety -= 1;
        }
        return isEatKot;
    }

    public boolean sleep() {
        boolean isEatKot = isEat();
        if (isEatKot) {
            System.out.println("Кот " + this.name + " спит.");
            this.satiety -= 1;
        }
        return isEatKot;
    }

    public boolean chaseMouse() {
        boolean isEatKot = isEat();
        if (isEatKot) {
            System.out.println("Кот " + this.name + " преследует мышь.");
            this.satiety -= 1;
        }
        return isEatKot;
    }

    public boolean sit() {
        boolean isEatKot = isEat();
        if (isEatKot) {
            System.out.println("Кот " + this.name + " сидит.");
            this.satiety -= 1;
        }
        return isEatKot;
    }

    public boolean lay() {
        boolean isEatKot = isEat();
        if (isEatKot) {
            System.out.println("Кот " + this.name + " лежит.");
            this.satiety -= 1;
        }
        return isEatKot;
    }

    public void eat(int eatCount) {
        this.satiety += eatCount;
        System.out.println("Кот " + this.name + " поел.");
    }

    public void eat(int eatCount, String foodName) {

        eat(eatCount);
        System.out.println("Кот " + this.name + " съел" + foodName);
    }

    public void eat() {
        eat(10, "Kitekat");
    }

    private boolean isEat() {
        if (this.satiety == 0) {
            System.out.println("Хочу есть, покорми меня");
            return false;
        } else return true;
    }
}
