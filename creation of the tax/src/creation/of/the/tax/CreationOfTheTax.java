/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.of.the.tax;

import java.util.Scanner;

/**
 *
 * @author mohamed
 */
public class CreationOfTheTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
       // junit test
        
        JUnitCore runner=new JUnitCore();
        Result result=runner.run(NewJUnitTest.class);
        System.out.println("run tests: "+result.getRunCount());
        System.out.println("failed tests: "+result.getFailureCount());
        System.out.println("ignored tests: "+result.getIgnoreCount());
        System.out.println("success: "+result.wasSuccessful());

        
        //normal run
       
        Scanner in=new Scanner(System.in);
       creation get=new creation();
        System.out.println("enter your salary");
        int x=in.nextInt();
        int y =get.gettax(x);
        System.out.println("your tax = "+y);
      
        
        
        
    }
    
}
