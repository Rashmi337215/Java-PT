/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p08;

/**
 *
 * @author SMV
 */
public class P08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=7;
        int sq=a*a;
        if(sq%10==a){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not Automorphic number");
        }
    }
    
}
