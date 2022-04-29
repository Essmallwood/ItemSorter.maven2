package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */

public class PriceComparator  implements Comparator<Item> {

    @Override
    public int compare(Item price1, Item price2) {
        return price1.getPrice().compareTo( price2.getPrice());
    }
}