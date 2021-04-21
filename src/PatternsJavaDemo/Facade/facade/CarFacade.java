package PatternsJavaDemo.Facade.facade;

import PatternsJavaDemo.Facade.parts.Door;
import PatternsJavaDemo.Facade.parts.Ignition;
import PatternsJavaDemo.Facade.parts.Wheel;

public class CarFacade {
    private Door door = new Door();
    private Ignition ignition = new Ignition();
    private Wheel wheel = new Wheel();

    public void go() {
        door.open();
        ignition.fire();
        wheel.turn();
    }

}
