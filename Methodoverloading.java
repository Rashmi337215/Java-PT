/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author SMV
 */
 class Hotel {
     void eat(int a){
         System.out.println("Dosa");
     }
     void eat(double d){
         System.out.println("Idly");
     }
     void eat(char c){
         System.out.println("Vada");
     }
 }

    /**
     * @param args the command line arguments
     */
    public class Methodoverloading{
        public static void main(String[] args) {
            Hotel h=new Hotel();
            h.eat(10);
            h.eat(13.99);
            h.eat('a');
            
    
        
    }
        // TODO code application logic here
    }
    

