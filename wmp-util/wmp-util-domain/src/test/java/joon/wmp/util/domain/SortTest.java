package joon.wmp.util.domain;

import joon.wmp.util.domain.RegularExpression;
import joon.wmp.util.domain.Sort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortTest {

    private RegularExpression regularExpression;
    private Sort sort;

    @Before
    public void setUp(){
        regularExpression = new RegularExpression("b!12@#!#cAb32155555");
        sort = new Sort(regularExpression);
    }

    @Test
    public void getNumSortTest(){
        assertEquals("1122355555", sort.getNumSort());
    }

    @Test
    public void getAlphabetSortTest(){
        assertEquals("Abbc", sort.getAlphabetSort());
    }

    @Test
    public void getCrossSortTest(){
        assertEquals("A1b1b2c2355555", sort.getCrossSort());
    }
}
