package PatternsJavaDemo.AbstractFactory.start;

import PatternsJavaDemo.AbstractFactory.factory.impl.RussianFactory;
import PatternsJavaDemo.AbstractFactory.factory.impl.USAFactory;
import PatternsJavaDemo.AbstractFactory.factory.interfaces.TransportFactory;
import PatternsJavaDemo.AbstractFactory.transport.interfaces.Aircraft;

import java.util.Scanner;

public class Start {

    private static TransportFactory factory;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String h = scanner.next();

        // Присваиваем абстрактной фабрике конкретную реализацию
        if (h.equals("ru")) {
            factory = new RussianFactory();
        }

        else {
            factory = new USAFactory();
        }

        Aircraft aircraft = factory.createAircraft(); // Присваимваем абстрактному самолету конкретную реализацию TU134 или Boeing747
        aircraft.flight();


    }
}
