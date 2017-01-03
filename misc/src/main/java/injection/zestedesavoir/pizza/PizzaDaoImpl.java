package injection.zestedesavoir.pizza;

import injection.zestedesavoir.domain.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by franck on 16/03/16.
 */
public class PizzaDaoImpl implements PizzaDao{

    private final Map<Pizza.TypePizza,Pizza> database = new HashMap<Pizza.TypePizza, Pizza>();
    {
        database.put(Pizza.TypePizza.MARGHERITA, new Pizza("Margherita", Pizza.TypePizza.MARGHERITA, 6.20));
        database.put(Pizza.TypePizza.PEPPERONI, new Pizza("Pepperoni", Pizza.TypePizza.PEPPERONI, 7.40));
        database.put(Pizza.TypePizza.AMERICAN_HOT, new Pizza("American Hot", Pizza.TypePizza.AMERICAN_HOT, 8.10));

    }
    public List<Pizza> getAll(){

        return new ArrayList<Pizza>(database.values());
    }

    public Pizza get(Pizza.TypePizza type){
        return database.get(type);
    }

}
