package my.project.com;

import java.sql.SQLOutput;

public class Iphone {

    String model;
    String color;
    int length;
    int weight;
    int price;

    int[] array = {1,2,3,4,5};
    int[] array1 = new int[10];


    public Iphone() {
        color = "Black";
        length = 10;
        price = 1000;
    }

    public int getPrice() {
        return price;
    }

    public int availablePhones(int soldPhones) {
        int available = 100;
        int remnant;

        return remnant = available - soldPhones;
    }

    public void isEnoughEnergy(int hours, int availableEnergy) {
        if(hours < availableEnergy) {
            System.out.println("Continue work");
        } else {
            System.out.println("Need charge!");
        }
    }

    public void fullCharge(int maxCharge, int energy) {
        while (energy < maxCharge) {
            System.out.println("wait full charge = " + energy);
            energy++;
        }
    }

    public void arrayElements() {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }



}
