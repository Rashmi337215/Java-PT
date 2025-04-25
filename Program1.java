/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;

/**
 *
 * @author SMV
 */
public class Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=12345;
        int ans=0;
        int rem=0;
        while(num>0)
        {
            rem=num%10;
            ans=ans+rem;
            num=num/10;
        }
   System.out.println(ans);
    }
    
}
