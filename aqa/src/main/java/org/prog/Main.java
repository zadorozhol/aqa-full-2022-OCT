package org.prog;

import org.prog.cars.BMW;
import org.prog.cars.ICar;

public class Main {

    public static void main(String... args) {
        AnotherClass anotherClass = new AnotherClass();
        ChildClass childClass = new ChildClass();

//        childClass.printString("aaa");
//        childClass.printString("aaa", "aaa");
//        childClass.printString("aaa", "aaa", "aaa");

//        Volvo volvo = new Volvo();
//        Mazda mazda = new Mazda();

//        BMW bmwRed = new BMW();
//        BMW bmwBlue = new BMW();
//        bmwRed.color = "red";
//        changeColor(bmwRed, "yellow");
//        changeColor(bmwRed, "cyan");

//        bmwBlue.color = "blue";
//        bmwBlue.color = "green";

//        useCar(bmwRed);
//        useCar(bmwBlue);
//        useCar(volvo);

//        System.out.println(bmwRed.color);
//        System.out.println(bmwBlue.color);

//        int i = 100;
//        i = increment(100);
//        increment(100);
//        i += 100;
//        System.out.println(i);

    }

    public static void changeColor(BMW bmw, String color) {
        bmw.color = color;
    }

    public static int increment(int input) {
        return input += 100;
    }

    public static void useCar(ICar iCar) {
        iCar.drive();
        iCar.turn();
        iCar.slow();
    }
}
