/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1.pkg2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class salaryTest {
    
    public salaryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testSalarycalculator() {
        salary s  = new salary(40, 100);
        double expected = 4000;
        double actual = s.salarycalculator();
        assertEquals(expected, actual,0.00001);
    }

    
    @Test
    public void testGetsalary() {
       salary s  = new salary(40, 100);
       double expected = 4000; 
       double actual = s.getsalary();
        assertEquals(expected, actual, 0.00001);
    }
    
}
