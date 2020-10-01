package org.kersevanivan.ingredients;

import org.kersevanivan.Pizza;
import org.kersevanivan.PizzaDecorator;

/**
 * <p>Title: WithFungies.</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 01.10.20 09:04
 */
public class WithFungies extends PizzaDecorator {
    public WithFungies(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.8;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " - mushrooms";
    }
}
