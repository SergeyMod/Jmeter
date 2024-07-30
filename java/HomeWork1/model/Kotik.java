package model;

import java.util.Random;

public class Kotik {

	private int satiety = 10;
	private static int count;
	
	private String name;
	private int prettiness;
	private int weight;
	private String meow;

	public Kotik() {
		count++;
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
			switch(temp) {
				case 0: if (play()) {eat();}
					break;
				case 1: if (sleep()) {eat();}
					break;
				case 2: if (chaseMouse()) {eat();}
					break;
				case 3: if (lay()) {eat();}
					break;
				case 4: if (sit()) {eat();}	
			}
		}
	}

	public boolean play() {
		return  is_eat("играет.");		
	}
	
	public boolean sleep() {
		return is_eat("спит.");
	}
	
	public boolean chaseMouse() {
		return is_eat("преследует мышь.");
	}

	public boolean sit() {
		return is_eat("сидит.");
	}

	public boolean lay() {
		return is_eat("лежит.");
	}
	
	public void eat(int eatCount) {
		this.satiety += eatCount;
		System.out.println("Кот " + this.name + " поел.");
	}

	public void eat(int eatCount, String foodName) {
		eat(eatCount);
	}

	public void eat() {
		eat(10, "Kitekat");
	}
	
	private boolean is_eat(String action) {
		if (this.satiety == 0) {
			System.out.println("Хочу есть, покорми меня");
			return true;
		}
		else {
			System.out.println("Кот " + this.name + " " + action);
			this.satiety -= 1;
			return false;
		}	
	}
}
