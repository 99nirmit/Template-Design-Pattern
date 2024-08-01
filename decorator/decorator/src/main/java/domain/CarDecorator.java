package domain;

public class CarDecorator implements Car{

    protected Car carDecorator;

    public CarDecorator(Car car) {
        this.carDecorator = car;
    }

    @Override
    public double cost() {
        return carDecorator.cost();
    }

    @Override
    public String description() {
        return carDecorator.description();
    }
}
