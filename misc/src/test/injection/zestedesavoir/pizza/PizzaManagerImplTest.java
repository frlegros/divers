package injection.zestedesavoir.pizza;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 19/03/16.
 */
public class PizzaManagerImplTest {

    public PizzaManager pizzaManager;
    public PizzaDao pizzaDao;

    @Before
    public void setUp() throws Exception {

        pizzaDao = new PizzaDaoImpl();
        pizzaManager = new PizzaManagerImpl(pizzaDao);

    }

    @Test
    public void testMenu() throws Exception {

        System.out.println(pizzaManager.menu());

    }

    @Test
    public void testMargherita() throws Exception {

        System.out.println(pizzaManager.margherita());
    }

    @Test
    public void testPepperoni() throws Exception {

        System.out.println(pizzaManager.pepperoni());
    }

    @Test
    public void testAmericanHot() throws Exception {

        System.out.println(pizzaManager.americanHot());
    }
}