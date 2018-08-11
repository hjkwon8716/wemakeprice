package joon.wmp.util.domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RegularExpressionTest {
    //
    private RegularExpression regularExpression;

    @Before
    public void setUp(){
        regularExpression = new RegularExpression("b!12@#!#cAb32155555");
    }

    @Test
    public void getNumTest(){
        assertEquals("1232155555", regularExpression.getNum());
    }

    @Test
    public void getAlphabetTest(){
        assertEquals("bcAb", regularExpression.getAlphabet());
    }
}
