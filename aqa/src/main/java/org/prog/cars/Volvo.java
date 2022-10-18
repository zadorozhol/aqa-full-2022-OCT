package org.prog.cars;

public class Volvo implements ICar {
    @Override
    public void drive() {
        System.out.println("Drives safe");
    }

    @Override
    public void turn() {
        System.out.println("turns safe");
    }

    @Override
    public void slow() {
        System.out.println("goes slow");
    }
}
