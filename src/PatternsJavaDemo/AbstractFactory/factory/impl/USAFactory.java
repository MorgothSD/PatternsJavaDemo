package PatternsJavaDemo.AbstractFactory.factory.impl;

import PatternsJavaDemo.AbstractFactory.factory.interfaces.TransportFactory;
import PatternsJavaDemo.AbstractFactory.transport.impl.aircraft.Boeing747;
import PatternsJavaDemo.AbstractFactory.transport.impl.car.Porsche;
import PatternsJavaDemo.AbstractFactory.transport.interfaces.Aircraft;
import PatternsJavaDemo.AbstractFactory.transport.interfaces.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
