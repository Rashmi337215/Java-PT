/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog6;

/**
 *
 * @author SMV
 */
public class Prog6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=15;
        if(num%2==0 && num%3==0)
        {
            System.out.println("Java");
           
        }
        else if(num%2==0)
        {
            System.out.println("Python");
        }
        else if(num%3==0)
        {
            System.out.println("c/C++");
        }
    }
    
}
