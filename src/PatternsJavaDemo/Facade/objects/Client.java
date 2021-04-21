package PatternsJavaDemo.Facade.objects;

import PatternsJavaDemo.Facade.facade.CarFacade;
import PatternsJavaDemo.Facade.parts.Door;
import PatternsJavaDemo.Facade.parts.Ignition;
import PatternsJavaDemo.Facade.parts.Wheel;

public class Client {

    public static void main(String[] args) {
        Door door = new Door();
        door.open();

        Ignition ignition = new Ignition();
        ignition.fire();

        Wheel wheel = new Wheel();
        wheel.turn();


        // Вызов через facade
        CarFacade carFacade = new CarFacade();
        carFacade.go();
    }
}
