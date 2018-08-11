package joon.wmp.util.domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OutputTest {

    private RegularExpression regularExpression;
    private Sort sort;
    private Output output;

    @Before
    public void setUp(){
        regularExpression = new RegularExpression("b!12@#!#cAb32155555");
        sort = new Sort(regularExpression);
        output = new Output(sort.getCrossSort(), 5);
    }

    @Test
    public void getShareTest(){
        assertEquals("A1b1b2c235", output.getShare());
    }

    @Test
    public void getBalanceTest(){
        assertEquals("5555", output.getBalance());
    }

    @Test
    public void getOutputByInputEmptyTest(){
        RegularExpression re = new RegularExpression("");
        Sort so = new Sort(re);
        Output op = new Output(so.getCrossSort(), 1);
        assertEquals("", op.getShare());
        assertEquals("", op.getBalance());
    }

}
