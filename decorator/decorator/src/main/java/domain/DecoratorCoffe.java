package domain;

// Decorator Class

public class DecoratorCoffe implements Coffee{

    protected Coffee decoratedCoffe;

    public DecoratorCoffe(Coffee coffee){
        this.decoratedCoffe = coffee;
    }


    @Override
    public double cost() {
        return decoratedCoffe.cost();
    }

    @Override
    public String description() {
        return decoratedCoffe.description();
    }
}
