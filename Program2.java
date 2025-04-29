/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

/**
 *
 * @author SMV
 */
class City{
    void place(int a){
        System.out.println("Chennai");
    }
    void place(int a,int b){
        System.out.println("Udupi");
    }
    void place(int a,int b,int c){
        System.out.println("Pune");
    }
}

public class Program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       City c=new City();
       c.place(10);
       c.place(10,20);
       c.place(10,20,30);
       
    }
    
}
