/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog7;

/**
 *
 * @author SMV
 */
public class Prog7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age=2;
        if(age<12)
        {
            System.out.println("Minor");
        }
        else if(age>=13 && age<=60)
        {
            System.out.println("Normal");
        }
        else if(age>60)
        {
            System.out.println("Senior Citizen");
        }
    }
    
}
