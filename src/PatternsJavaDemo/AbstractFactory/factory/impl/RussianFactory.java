package PatternsJavaDemo.AbstractFactory.factory.impl;

import PatternsJavaDemo.AbstractFactory.factory.interfaces.TransportFactory;
import PatternsJavaDemo.AbstractFactory.transport.impl.aircraft.TU134;
import PatternsJavaDemo.AbstractFactory.transport.impl.car.Niva;
import PatternsJavaDemo.AbstractFactory.transport.interfaces.Aircraft;
import PatternsJavaDemo.AbstractFactory.transport.interfaces.Car;

public class RussianFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
