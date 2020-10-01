package org.kersevanivan.ingredients;

import org.kersevanivan.Pizza;
import org.kersevanivan.PizzaDecorator;

/**
 * <p>Title: WithCheese.</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 01.10.20 09:03
 */
public class WithCheese extends PizzaDecorator {
    public WithCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " - original Edammer Cheese";
    }
}
