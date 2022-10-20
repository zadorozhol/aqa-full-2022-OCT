package org.prog.cars;

public class BMW implements ICar {
    public String color;
    public int speedLimit;

    public String getSeepLimit(){
        return "5";
    }

    @Override
    public void drive() {
        System.out.println("BMW goes wroom");
    }

    @Override
    public void turn() {
        System.out.println("Turn without signal");
    }

    @Override
    public void slow() {
        System.out.println("Has no brakes");
    }
}
