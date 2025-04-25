/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog8;

/**
 *
 * @author SMV
 */
public class Prog8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age=24;
        char gender='F';
        if(gender=='F'|| gender=='f')
        {
            if(age>18)
            {
                System.out.println("Eligible Spinster");
            }
            else
            {
                System.out.println("Not eligible spinster");
            }
        }
    }
    
}
