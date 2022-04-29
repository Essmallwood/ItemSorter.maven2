package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 *
 * // compa
 */

// Comparator - compare two objects

public class IdComparator implements Comparator <Item> {

    @Override
    public int compare(Item id1, Item id2) {

        return id1.getId().compareTo( id2.getId() );
    }
}