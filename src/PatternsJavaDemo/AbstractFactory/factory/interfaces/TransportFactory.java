package PatternsJavaDemo.AbstractFactory.factory.interfaces;

import PatternsJavaDemo.AbstractFactory.transport.interfaces.Aircraft;
import PatternsJavaDemo.AbstractFactory.transport.interfaces.Car;

public interface TransportFactory {

    Car createCar();

    Aircraft createAircraft();

}
