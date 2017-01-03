package injection.zestedesavoir;

import injection.zestedesavoir.domain.Pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by franck on 16/03/16.
 */
public class PizzaDao {

    public List<Pizza> getAll(){

        List listPizza = new ArrayList();
        listPizza.add(new Pizza("Pizza 1", Pizza.TypePizza.PEPPERONI,25));
        listPizza.add(new Pizza("Pizza 2", Pizza.TypePizza.AMERICAN_HOT,18));
        listPizza.add(new Pizza("Pizza 3", Pizza.TypePizza.MARGHERITA,23));
        return listPizza;
    }
}
