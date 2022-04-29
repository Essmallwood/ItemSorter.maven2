package rocks.zipcode.io.comparators.namecomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.NameComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PositiveCompareToTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(32L, "Apple", 59.0);
        Item item2 = new Item(54L, "Banana", 45.0);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test2() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(23L, "Banana", 54.0);
        Item item2 = new Item(54L, "Wild Cherry", 43.0);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }


    @Test
    public void test3() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(30L, "Plums", 45.0);
        Item item2 = new Item(23L, "Pumpkin", 23.0);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test4() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(58L, "Banana", 49.0);
        Item item2 = new Item(29L, "apple", 25.0);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test5() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(32L, "Banana", 45.0);
        Item item2 = new Item(54L, "wild Cherry", 23.0);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }


    @Test
    public void test6() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(329L, "Plums", 38.0);
        Item item2 = new Item(32L, "pumpkin", 223.0);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

}
