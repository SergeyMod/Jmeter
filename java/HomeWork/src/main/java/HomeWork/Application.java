package HomeWork;

import HomeWork.model.Kotik;


public class Application {

    public static void main(String[] args) {

        Kotik kotik = new Kotik(2, "Рыжик", 2, "мяу");
        Kotik kotik2 = new Kotik();
        kotik2.setKotik(3, "Kit", 3, "meow");
        kotik2.liveAnotherDay();
        System.out.println("Имя: " + kotik2.getName() + "\nВес: " + kotik2.getWeight());
        String yesOrNo = (kotik.getMeow().equals(kotik2.getMeow())) ? "" : "не ";
        System.out.println("Коты говорят " + yesOrNo + "одинаково");
        System.out.println("Всего котов: " + Kotik.getCount());

    }
}
