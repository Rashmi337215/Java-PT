/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program10;

/**
 *
 * @author SMV
 */
public class Program10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cars="kia,bmw,benz";
        String[] s=cars.split(",");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    
}
