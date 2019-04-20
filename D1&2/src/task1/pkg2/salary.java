
package task1.pkg2;
public class salary {
   public double time;
   public double rate;
   public double salary;
   public salary(int time , int rate)
   {
       this.time = time ;
       this.rate = rate;    
   }
   public double salarycalculator () 
   { 
       salary = time * rate ;
       return salary;
   }
   public double getsalary()
   {
       return salary;
   }
}
