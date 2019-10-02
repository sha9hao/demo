package test;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class demoTest {

    demo d;

    @Parameterized.Parameters
    public static Collection<?> data(){
        return Arrays.asList(new Object[][]{{"1+2", 3}, {"1+3+5", 9}, {"1+3+5+7", 16}});
    }

    @Parameterized.Parameter(0)
    public String input;

    @Parameterized.Parameter(1)
    public int result;

    @Before
    public void before(){
        d = new demo();
    }

//    @Test
//    public void getIn() {
//
//        assertEquals("aa", d.getIn("aa"));
//
//    }

    @Test
    public void calculate() {
        assertEquals(result, d.calculate(this.input));

    }
}