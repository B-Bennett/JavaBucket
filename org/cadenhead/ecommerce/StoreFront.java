package org.cadenhead.ecommerce;

/**
 * Created by BennettIronYard on 2/12/16.
 */
import java.util.*;

public class StoreFront {
    private LinkedList catalog = new LinkedList();

    public void addItem(String id, String name, String price, String quant) {
        Item it = new Item(id, name, price, quant);
        catalog.add(it);

    }
    public void addItem2(String id, String name, String price, String quant, String discountIn) {
        Item2 it = new Item2(id, name, price, quant, discountIn);
        catalog.add(it);
    }

    public Item getItem(int i) {
        return (Item)catalog.get(i);
    }

    public int getSize() {
        return catalog.size();

    }
    public void sort() {
        Collections.sort(catalog);
    }


}
