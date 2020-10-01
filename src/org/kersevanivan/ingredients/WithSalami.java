package org.kersevanivan.ingredients;

import org.kersevanivan.Pizza;
import org.kersevanivan.PizzaDecorator;

/**
 * <p>Title: WithSalami</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 01.10.20 09:04
 */
public class WithSalami extends PizzaDecorator {
    public WithSalami(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " - italian classic salami";
    }
}
