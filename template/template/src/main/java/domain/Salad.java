package domain;

public class Salad extends Meal{
    @Override
    void prepareIngredits() {
        System.out.println("Preparing Salad Ingredients");
    }

    @Override
    void cook() {
        System.out.println("Cooking Salad");
    }

    @Override
    void serve() {
        System.out.println("Serving Salad");
    }
}
