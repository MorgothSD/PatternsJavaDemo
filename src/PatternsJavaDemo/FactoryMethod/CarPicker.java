package PatternsJavaDemo.FactoryMethod;

// Фабрика по созданию автомобилей
public class CarPicker {

    // Фабричный метод для создания нужного автомобиля
    public Car pickCar(RoadType roadType) {
        Car car = null;

        switch (roadType) {
            case CITY:
                car = new LandRover();
                break;
            case OFF_ROAD:
                car = new Geep();
            case COUNTRY_ROAD:
                car = new BestGeep();
                break;
        }

        return car;
    }
}
