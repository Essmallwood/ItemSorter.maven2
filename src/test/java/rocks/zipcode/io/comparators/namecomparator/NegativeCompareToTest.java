package rocks.zipcode.io.comparators.namecomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.NameComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
@SuppressWarnings("all")
public class NegativeCompareToTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(02L, "Apple", 40.0);
        Item item2 = new Item(03L, "Banana", 20.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test2() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(04L, "Banana", 40.0);
        Item item2 = new Item(05L, "Wild Cherry", 20.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }


    @Test
    public void test3() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(03L, "Plums", 29.0);
        Item item2 = new Item(29L, "Pumpkin", 403.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test4() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(89L, "Banana", 32.0);
        Item item2 = new Item(470L, "apple", 24.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test5() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(903L, "Banana", 89.0);
        Item item2 = new Item(89L, "wild Cherry", 49.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }


    @Test
    public void test6() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(18L, "Plums", 79.0);
        Item item2 = new Item(76L, "pumpkin", 68.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

}
