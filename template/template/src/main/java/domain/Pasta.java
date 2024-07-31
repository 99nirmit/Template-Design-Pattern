package domain;

public class Pasta extends Meal{
    @Override
    void prepareIngredits() {
        System.out.println("Preparing Pasta Ingredients");
    }

    @Override
    void cook() {
        System.out.println("Cooking Pasta");
    }

    @Override
    void serve() {
        System.out.println("Serving Pasta");
    }
}
