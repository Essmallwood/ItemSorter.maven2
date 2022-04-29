package rocks.zipcode.io.comparators.idcomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.IdComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NeutralCompareToTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>) new IdComparator();
        Long id = 0L;
        Item item1 = new Item(id, null, 40.0);
        Item item2 = new Item(id, null, 30.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertEquals(0, comparisonValue, 0);
    }

    @Test
    public void test2() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>) new IdComparator();
        Long id = 1L;
        Item item1 = new Item(id, null, 20.0);
        Item item2 = new Item(id, null, 10.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertEquals(0, comparisonValue, 0);
    }

    @Test
    public void test3() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>) new IdComparator();
        Long id = 2L;
        Item item1 = new Item(id, null, 19.0);
        Item item2 = new Item(id, null, 17.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertEquals(0, comparisonValue, 0);
    }


    @Test
    public void test4() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>) new IdComparator();
        Long id = 3L;
        Item item1 = new Item(id, null, 34.0);
        Item item2 = new Item(id, null, 12.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertEquals(0, comparisonValue, 0);
    }

    @Test
    public void test5() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>) new IdComparator();
        Long id = 4L;
        Item item1 = new Item(id, null, 13.0);
        Item item2 = new Item(id, null, 16.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertEquals(0, comparisonValue, 0);
    }

    @Test
    public void test6() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>) new IdComparator();
        Long id = 5L;
        Item item1 = new Item(id, null, 56.0);
        Item item2 = new Item(id, null, 16.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertEquals(0, comparisonValue, 0);
    }
}
