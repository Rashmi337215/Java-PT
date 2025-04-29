/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program3;

/**
 *
 * @author SMV
 */
class Game{
    void play(String name,int n){
        System.out.println("Cricket");
    }
    void play(int n,String name){
        System.out.println("Football");
    }
}
public class Program3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game g=new Game();
        g.play("Virat",18);
        g.play(10,"Messi");
    }
    
}
