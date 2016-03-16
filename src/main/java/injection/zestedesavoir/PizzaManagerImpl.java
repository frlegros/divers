package injection.zestedesavoir;

import java.util.List;

/**
 * Created by franck on 16/03/16.
 */
public class PizzaManagerImpl implements PizzaManager{

    private final PizzaDao pizzaDao;

    public PizzaManagerImpl(PizzaDao pizzaDao) {
        this.pizzaDao = pizzaDao;
    }

    public List<Pizza> menu() {
        return pizzaDao.getAll();
    }
}
