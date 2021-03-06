package PatternsJavaDemo.AbstractFactory.transport.impl.car;

import PatternsJavaDemo.AbstractFactory.transport.interfaces.Car;

public class Porsche implements Car {

    @Override
    public void drive() {
        System.out.println("Drives at speed 160 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 1 sec");
    }
}
