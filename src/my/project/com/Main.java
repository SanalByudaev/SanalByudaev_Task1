package my.project.com;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Iphone profi = new Iphone();
        System.out.println(profi.color);

        Iphone price = new Iphone();
        System.out.println(price.getPrice());

        Iphone work = new Iphone();
        work.isEnoughEnergy(2, 3);
        work.isEnoughEnergy(3,1);

        Iphone available = new Iphone();
        System.out.println("Available phones quantity is " + available.availablePhones(55));

        Scooter custom = new Scooter("White", 4);
        System.out.println(custom.color);

        Iphone new12 = new Iphone();
        new12.fullCharge(100, 95);

        Iphone new11 = new Iphone();
        new11.fullCharge(100,90);

        new12.arrayElements();

    }
}