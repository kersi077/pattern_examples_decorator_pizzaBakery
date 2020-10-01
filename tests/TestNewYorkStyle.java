import org.junit.Assert;
import org.junit.Test;
import org.kersevanivan.Pizza;
import org.kersevanivan.ingredients.WithCheese;
import org.kersevanivan.ingredients.WithTomatoSauce;
import org.kersevanivan.pizzaStyle.PizzaDoughNY;

/**
 * <p>Title: TestIngredients</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 01.10.20 10:10
 */
public class TestNewYorkStyle {

    @Test
    public void testNewYorkStyle() {
        Pizza newYorkStyle = new PizzaDoughNY();
        Assert.assertEquals(2.0, newYorkStyle.getCost(), 0.0 );
        Assert.assertEquals( "New York Style Dough", newYorkStyle.getIngredients() );
    }

    @Test
    public void testNewYorkStyleWithCheese() {
        Pizza newYorkStyle = new PizzaDoughNY();
        newYorkStyle = new WithCheese(newYorkStyle);

        Assert.assertEquals(3.5, newYorkStyle.getCost(), 0.0 );
        Assert.assertEquals( "New York Style Dough - original Edammer Cheese", newYorkStyle.getIngredients() );
    }

    @Test
    public void testNewYorkStyleWithCheeseWithTomatosauce() {
        Pizza newYorkStyle = new PizzaDoughNY();
        newYorkStyle = new WithCheese( new WithTomatoSauce(newYorkStyle) );

        Assert.assertEquals(6.5, newYorkStyle.getCost(), 0.0 );
        Assert.assertEquals( "New York Style Dough - tomato sauce - original Edammer Cheese", newYorkStyle.getIngredients() );
    }
}
