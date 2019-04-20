/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.of.the.tax;

/**
 *
 * @author mohamed
 */
public class creation implements NewInterface{

    @Override
    public int gettax(int x) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if(x>=100&&x<500)return 10;
            if(x>=500&&x<1000)return 12;
            if(x>=1000&&x<5000)return 15;
            if(x>=5000&&x<=10000)return 17;
                return 0;
     }

    
    public int fact(int x){
    int res=1;
        for (int i = x; i > 0; i--) {
            res=res*i;
        }
    return res;
    }
    
}
