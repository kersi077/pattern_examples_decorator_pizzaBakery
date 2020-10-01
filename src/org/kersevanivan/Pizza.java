package org.kersevanivan;

/**
 * <p>Title: Pizza.</p>
 * <p>Description: This is our "Component" in the UML-Classdiagramm in our handout.</p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 01.10.20 08:54
 */
public interface Pizza {
    /**
     * @return the price of our pizza.
     */
    public double getCost();

    /**
     * @return all the yummy ingredients on the pizza.
     */
    public String getIngredients();
}
