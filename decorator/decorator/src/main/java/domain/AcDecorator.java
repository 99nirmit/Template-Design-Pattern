package domain;

public class AcDecorator extends CarDecorator{

    public AcDecorator(Car car) {
        super(car);
    }

    @Override
    public double cost() {
        return super.cost() + 2000;
    }

    @Override
    public String description() {
        return super.description() + ", Air Condition";
    }
}
