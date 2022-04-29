package rocks.zipcode.io.comparators.namecomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.NameComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NeutralCompareToTest {
    @Test
    public void test1() {
        // given
        String itemName = "apple";
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(02L, itemName, 89.0);
        Item item2 = new Item(94L, itemName, 79.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertEquals(0.0, comparisonValue, 0);
    }

    @Test
    public void test2() {
        // given
        String itemName = "banana";
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(03L, itemName, 39.0);
        Item item2 = new Item(32L, itemName, 329.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertEquals(0.0, comparisonValue, 0);
    }

    @Test
    public void test3() {
        // given
        String itemName = "cherry";
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(332L, itemName, 43.0);
        Item item2 = new Item(32L, itemName, 43.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertEquals(0.0, comparisonValue, 0);
    }
}
