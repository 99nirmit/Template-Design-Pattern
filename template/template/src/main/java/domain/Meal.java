package domain;

public abstract class Meal {

    public final void PrepareMeal(){
        prepareIngredits();
        cook();
        serve();
    }

    abstract void  prepareIngredits();
    abstract void cook();
    abstract void serve();
}
