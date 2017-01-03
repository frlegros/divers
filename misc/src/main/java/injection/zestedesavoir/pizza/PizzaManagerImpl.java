package injection.zestedesavoir.pizza;

import injection.zestedesavoir.domain.Pizza;

import java.util.List;
import javax.inject.Inject;

/**
 * Created by franck on 16/03/16.
 * https://zestedesavoir.com/tutoriels/309/introduction-a-linjection-de-dependances-en-java/
 */
public class PizzaManagerImpl implements PizzaManager{

    private final PizzaDao pizzaDao;

    @Inject public PizzaManagerImpl(PizzaDao pizzaDao) {

        this.pizzaDao = pizzaDao;
    }

    public List<Pizza> menu() {
        return pizzaDao.getAll();
    }

    public Pizza margherita(){
        return pizzaDao.get(Pizza.TypePizza.MARGHERITA);
    };

    public Pizza pepperoni(){
        return pizzaDao.get(Pizza.TypePizza.PEPPERONI);
    };

    public Pizza americanHot(){
        return pizzaDao.get(Pizza.TypePizza.AMERICAN_HOT);
    };

}
