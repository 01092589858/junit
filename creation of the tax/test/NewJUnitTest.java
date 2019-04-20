/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import creation.of.the.tax.CreationOfTheTax;
import creation.of.the.tax.creation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mohamed
 */
public class NewJUnitTest {
  private creation tax;
  private creation mockitofact;
 
   
    @Before
    public void setUp() {
        tax=new creation();
     mockitofact=mock(creation().class);    
    }
    
    @After
    public void tearDown() {
        tax=null;
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
     @Test
     public void jtest() {
assertEquals(10,tax.gettax(100));
assertEquals(10,tax.gettax(499));
assertEquals(12,tax.gettax(500));
assertEquals(12,tax.gettax(999));
assertEquals(15,tax.gettax(1000));
assertEquals(15,tax.gettax(4999));
assertEquals(17,tax.gettax(5000));
assertEquals(17,tax.gettax(10000));
}

@Test
   public void mockitotest()
{       
        
        when(mockitofact.fact(3)).thenReturn(6);
        when(mockitofact.fact(10)).thenReturn(3628800);
        when(mockitofact.fact(5)).thenReturn(120);
assertEquals(6,tax.fact(3));
assertEquals(3628800,tax.fact(10));
assertEquals(120,tax.fact(5));



}


}
