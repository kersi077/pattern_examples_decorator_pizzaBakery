package org.kersevanivan.ingredients;

import org.kersevanivan.Pizza;
import org.kersevanivan.PizzaDecorator;

/**
 * <p>Title: WithTomatoSauce</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 01.10.20 09:04
 */
public class WithTomatoSauce extends PizzaDecorator {
    public WithTomatoSauce(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.0;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " - tomato sauce";
    }
}
