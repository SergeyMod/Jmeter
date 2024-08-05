package HomeWork1;
import HomeWork1.model.Kotik;


public class Application {

	public static void main(String[] args) {

		Kotik kotik = new Kotik(2, "kot", 2, "meow");
		

		Kotik kotik2 = new Kotik();
		kotik2.setKotik(3, "kot2", 3, "moew");

		kotik2.liveAnotherDay();
		System.out.println("Name: " + kotik2.getName() + "\nWeight: " + kotik2.getWeight());

	}

}
