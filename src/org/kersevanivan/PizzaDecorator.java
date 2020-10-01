package org.kersevanivan;

/**
 * <p>Title: PizzaDecorator.</p>
 * <p>Description: This is our abstract decorator, which implements the pizza interface. </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 01.10.20 09:00
 */
public abstract class PizzaDecorator implements Pizza {
    /** The best pizza in town! */
    private final Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza){
        this.decoratedPizza = pizza;
    }

    @Override
    public double getCost() {
        return this.decoratedPizza.getCost();
    }

    @Override
    public String getIngredients() {
        return this.decoratedPizza.getIngredients();
    }
}
