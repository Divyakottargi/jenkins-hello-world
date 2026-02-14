package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    
    @Test
    public void testAdd() {
        App myCalc = new App();
        int result = myCalc.add(2, 3);
        
        System.out.println("Testing addition: 2 + 3 = " + result);
        
        // This is the core of the test: it expects 5
        assertEquals(5, result);
    }
}