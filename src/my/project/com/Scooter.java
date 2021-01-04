package my.project.com;

import com.sun.deploy.util.BlackList;

public class Scooter {

    String color;
    int length;
    int wheels;
    int price;

    public Scooter(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    void move(int mile) {
        System.out.println(mile);


    }
}
