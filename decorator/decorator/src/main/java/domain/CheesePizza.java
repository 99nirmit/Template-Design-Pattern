package domain;

public class CheesePizza extends PizzaDecorator{

    public CheesePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }

    @Override
    public String descriptionO() {
        return super.descriptionO() + ", Cheese";
    }
}
