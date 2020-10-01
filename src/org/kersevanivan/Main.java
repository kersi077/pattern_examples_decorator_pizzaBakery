package org.kersevanivan;

import org.kersevanivan.ingredients.*;
import org.kersevanivan.pizzaStyle.PizzaDoughNY;
import org.kersevanivan.pizzaStyle.PizzaDoughNaples;

public class Main {

    public static void main(String[] args) {
        // Let's order a Pizza naples style with tomato sauce, ham and cheese.
        Pizza naplesPizza = new PizzaDoughNaples();
        printInvoice(naplesPizza);

        naplesPizza = new WithTomatoSauce(naplesPizza);
        naplesPizza = new WithCheese(naplesPizza);
        naplesPizza = new WithHam(naplesPizza);
        printInvoice(naplesPizza);

        // Let's order a Pizza new york style with tomato sauce, ham and cheese.
        Pizza newYorkStyle = new PizzaDoughNY();
        newYorkStyle = new WithTomatoSauce( new WithHam( new WithSalami( new WithFungies( new WithCheese( newYorkStyle ) ) ) ) ); // Wau!
        printInvoice(newYorkStyle);

    }

    public static void printInvoice(Pizza pizza) {
        System.out.println(pizza.getIngredients() + "\t\t\t\t" + pizza.getCost() + " €");
    }
}
