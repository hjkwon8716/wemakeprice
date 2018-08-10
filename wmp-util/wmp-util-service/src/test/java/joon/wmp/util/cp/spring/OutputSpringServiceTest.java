package joon.wmp.util.cp.spring;

import joon.wmp.util.domain.Output;
import joon.wmp.util.service.OutputService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class OutputSpringServiceTest {

    @Autowired
    private OutputService outputService;

    private String inputValue;
    private int condition;

    @Before
    public void setUp(){
        this.inputValue="b!12@#!#cAb32155555";
        this.condition = 5;
    }

    @Test
    public void getOutputTest(){
        Output output = outputService.getOutput(this.inputValue, this.condition);
        assertEquals("A1b1b2c235", output.getShare());
        assertEquals("5555", output.getBalance());
    }
}
