package injection.zestedesavoir.pizza;

import injection.zestedesavoir.domain.Pizza;

import java.util.List;

/**
 * Created by franck on 16/03/16.
 */
public interface PizzaDao {

    public List<Pizza> getAll();

    Pizza get(Pizza.TypePizza type);
}
