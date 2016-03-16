package injection.zestedesavoir;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by franck on 16/03/16.
 */
public class PizzaDao {

    public List<Pizza> getAll(){

        List listPizza = new ArrayList();
        listPizza.add(new Pizza("Pizza 1"));
        listPizza.add(new Pizza("Pizza 2"));
        listPizza.add(new Pizza("Pizza 3"));
        return listPizza;
    }
}
