/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author SMV
 
 */
abstract class Hotstar
{
    void login()
    {
        System.out.println("Login successful");
    }
    abstract void watch();
      
    }
class HotstarFree extends Hotstar
{

    @Override
    void watch() {
        System.out.println("watch with adds"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class HotstarPremium extends Hotstar
{

    @Override
    void watch() {
        System.out.println("watch without adds"); //To change body of generated methods, choose Tools | Templates.
    }
   
}

public class HotstarMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HotstarFree hf=new HotstarFree();
        hf.login();
        hf.watch();
        HotstarPremium hp=new HotstarPremium();
        hp.login();
        hp.watch();
        
    }
    
}
