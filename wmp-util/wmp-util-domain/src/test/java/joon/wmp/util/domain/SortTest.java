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

    @Test
    public void getCrossSortByNumEmptyTest(){
        RegularExpression re = new RegularExpression("b!@#!#cAb");
        Sort so = new Sort(re);
        assertEquals("Abbc", so.getCrossSort()
        );
    }

    @Test
    public void getCrossSortByNumIsGreaterTest(){
        RegularExpression re = new RegularExpression("34b!@#!#cAb1267");
        Sort so = new Sort(re);
        assertEquals("A1b2b3c467", so.getCrossSort()
        );
    }

    @Test
    public void getCrossSortByAlphabetEmptyTest(){
        RegularExpression re = new RegularExpression("!12@#!#32155555");
        Sort so = new Sort(re);
        assertEquals("1122355555", so.getCrossSort()
        );
    }

    @Test
    public void getCrossSortByAlphabetIsGreaterTest(){
        RegularExpression re = new RegularExpression("b!@#!#cAb12xyz6");
        Sort so = new Sort(re);
        assertEquals("A1b2b6cxyz", so.getCrossSort()
        );
    }

    @Test
    public void getCrossSortByEqualsTest(){
        RegularExpression re = new RegularExpression("b!@#!#cAb1226");
        Sort so = new Sort(re);
        assertEquals("A1b2b2c6", so.getCrossSort()
        );
    }

    @Test
    public void getCrossSortByNumAndAlphabetEmptyTest(){
        RegularExpression re = new RegularExpression("!@#!#");
        Sort so = new Sort(re);
        assertEquals("", so.getCrossSort()
        );
    }
}
