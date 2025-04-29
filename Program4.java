/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program4;

/**
 *
 * @author SMV
 */
class Amazon{
    void payment(){
        System.out.println("COD");
    }
    void payment(String name){
        System.out.println("UPI payment");
        
    }
    void payment(long cardnumber,int otp){
        System.out.println("Card payment");
    }
    void payment(String username,String password){
        System.out.println("Net banking");
    }
}
public class Program4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Amazon a=new Amazon();
        a.payment();
        a.payment("GPAY");
        a.payment(1234321234,456765);
        a.payment("User123","Password1232");
    }
    
}
