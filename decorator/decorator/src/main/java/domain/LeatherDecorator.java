package domain;

public class LeatherDecorator extends AcDecorator{


    public LeatherDecorator(Car car) {
        super(car);
    }

    @Override
    public double cost() {
        return super.cost() + 3000;
    }

    @Override
    public String description() {
        return super.description() + ", Leather Seats";
    }
}
