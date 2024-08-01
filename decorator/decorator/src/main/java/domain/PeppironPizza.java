package domain;

public class PeppironPizza extends PizzaDecorator{

    public PeppironPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }

    @Override
    public String descriptionO() {
        return super.descriptionO() + ", Pepperion";
    }
}
