package org.kersevanivan.pizzaStyle;

import org.kersevanivan.Pizza;

/**
 * <p>Title: PizzaDough - (DE: Pizza Teig)</p>
 * <p>Description: A Pizza needs a good dough. The naple style pizza is my favourite. </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 01.10.20 09:08
 */
public class PizzaDoughNaples implements Pizza {
    @Override
    public double getCost() {
        return 2.5;
    }

    @Override
    public String getIngredients() {
        return "Naple-Dough";
    }
}
