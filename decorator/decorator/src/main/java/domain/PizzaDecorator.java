package domain;

public class PizzaDecorator implements Pizza {

    protected Pizza pizzaDecorator;

    public PizzaDecorator(Pizza pizza){
        this.pizzaDecorator = pizza;
    }

    @Override
    public double cost() {
        return pizzaDecorator.cost();
    }

    @Override
    public String descriptionO() {
        return pizzaDecorator.descriptionO();
    }
}
