package domain;

public class BasicCar implements Car {

    @Override
    public double cost() {
        return 15000;
    }

    @Override
    public String description() {
        return "Basic Car";
    }
}
