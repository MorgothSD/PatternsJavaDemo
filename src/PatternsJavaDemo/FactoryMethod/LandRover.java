package PatternsJavaDemo.FactoryMethod;

public class LandRover implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed is 140 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stops in 2 seconds");
    }
}
