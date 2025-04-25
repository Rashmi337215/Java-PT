/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro6;

/**
 *
 * @author SMV
 */
public class PRO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=12345;
        int r=0;
        while(n>0)
        {
            r=n%10;
            System.out.print(r);
            n=n/10;
        }
    }
    
}
