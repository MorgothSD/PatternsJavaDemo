package PatternsJavaDemo.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        CarPicker carPicker = new CarPicker();

        Car car = carPicker.pickCar(RoadType.COUNTRY_ROAD);
        car.stop();

        car = carPicker.pickCar(RoadType.CITY);
        car.drive();
        car.stop();

        car = carPicker.pickCar(RoadType.OFF_ROAD);
        car.drive();
    }
}
