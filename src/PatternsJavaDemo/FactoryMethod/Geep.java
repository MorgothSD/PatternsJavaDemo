package PatternsJavaDemo.FactoryMethod;

public class Geep implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed is 60 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stops in 6 seconds average");
    }
}
