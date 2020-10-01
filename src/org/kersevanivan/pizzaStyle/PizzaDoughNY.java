package org.kersevanivan.pizzaStyle;

import org.kersevanivan.Pizza;

/**
 * <p>Title: PizzaDoughNY. </p>
 * <p>Description: A Pizza needs a good dough. The New York style is known all over the world.</p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 01.10.20 09:09
 */
public class PizzaDoughNY implements Pizza {
    @Override
    public double getCost() {
        return 2.0;
    }

    @Override
    public String getIngredients() {
        return "New York Style Dough";
    }
}
