package rocks.zipcode.io.comparators.pricecomparatortest;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NeutralCompareToTest {
    @Test
    public void test1() {
        // given
        Double itemPrice = 10.0;
        Comparator<Item> nameComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(43L, null, itemPrice);
        Item item2 = new Item(42L, null, itemPrice);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertEquals(0.0, comparisonValue, 0);
    }

    @Test
    public void test2() {
        // given
        Double itemPrice = 15.0;
        Comparator<Item> nameComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(32L, null, itemPrice);
        Item item2 = new Item(54L, null, itemPrice);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertEquals(0.0, comparisonValue, 0);
    }

    @Test
    public void test3() {
        // given
        Double itemPrice = 94.0;
        Comparator<Item> nameComparator = (Comparator<Item>)new PriceComparator();
        Item item1 = new Item(43L, null, itemPrice);
        Item item2 = new Item(23L, null, itemPrice);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertEquals(0.0, comparisonValue, 0);
    }
}
