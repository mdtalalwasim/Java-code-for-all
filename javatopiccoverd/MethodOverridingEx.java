
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim
 */

class Bank{
    int getRateOfReturn(){
        return 0;
    }
}

class IslamiBank extends Bank{
    int getRateOfReturn(){
        return 7;
    }
    
}
class SonaliBank extends Bank{
    @Override
    int getRateOfReturn(){
        return 8;
    }
}
class RupaliBank extends Bank{
    @Override
    int getRateOfReturn(){
        return 9;
    }
}
class JanataBank extends Bank{
    int getRateOfReturn(){
        return 10;
    }
}


public class MethodOverridingEx {
    public static void main(String[] args) {
       IslamiBank i = new IslamiBank();
       SonaliBank s = new SonaliBank();
       RupaliBank r = new RupaliBank();
       JanataBank j = new JanataBank();
       
       
        System.out.println("Islami Bank Rate of Interest :"+i.getRateOfReturn());
        System.out.println("Sonali Bank Rate of Interest :"+s.getRateOfReturn());
        System.out.println("Rupali Bank Rate of Interest :"+r.getRateOfReturn());
        System.out.println("Janata Bank Rate of Interest :"+j.getRateOfReturn());
       
    }
}
