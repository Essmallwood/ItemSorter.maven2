package rocks.zipcode.io.comparators.idcomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.IdComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NegativeCompareToTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(0L, "Car", 4.0);
        Item item2 = new Item(1L, "Toy", 5.0);

        // when
        Integer comparisonValue = idComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test2() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(1L, "Yogurt", 8.0);
        Item item2 = new Item(2L, "Wheel", 100.0);

        // when
        Integer comparisonValue = idComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }


    @Test
    public void test3() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(2L, "Door", 13.0);
        Item item2 = new Item(3L, "Window", 10.0);

        // when
        Integer comparisonValue = idComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test4() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(3L, "Yo-yo", 189.0);
        Item item2 = new Item(4L, "Rose", 56.0);

        // when
        Integer comparisonValue = idComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test5() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(4L, "Fries", 3.0);
        Item item2 = new Item(5L, "Burgers", 9.0);

        // when
        Integer comparisonValue = idComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }


    @Test
    public void test6() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>)new IdComparator();
        Item item1 = new Item(5L, null, 30.0);
        Item item2 = new Item(6L, null, 20.0);

        // when
        Integer comparisonValue = idComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }
}
