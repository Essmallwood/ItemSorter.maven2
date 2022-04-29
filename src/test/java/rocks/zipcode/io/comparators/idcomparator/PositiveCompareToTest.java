package rocks.zipcode.io.comparators.idcomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.IdComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
@SuppressWarnings("all")
public class PositiveCompareToTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(0L, null, 34.0);
        Item item2 = new Item(1L, null, 45.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test2() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(1L, null, 24.0);
        Item item2 = new Item(2L, null, 23.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }


    @Test
    public void test3() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(2L, null, 14.0);
        Item item2 = new Item(3L, null, 19.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test4() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(3L, null, 23.0);
        Item item2 = new Item(4L, null, 14.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test5() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(4L, null, 23.0);
        Item item2 = new Item(5L, null, 45.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }


    @Test
    public void test6() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(5L, null, 56.0);
        Item item2 = new Item(6L, null, 23.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }
}
