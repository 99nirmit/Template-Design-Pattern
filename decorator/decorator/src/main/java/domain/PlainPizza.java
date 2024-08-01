package domain;

public class PlainPizza implements Pizza{

    @Override
    public double cost() {
        return 5.0;
    }

    @Override
    public String descriptionO() {
        return "Plain Pizza";
    }
}
