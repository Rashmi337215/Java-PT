/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author SMV
 */
public interface Person
{
    int age=24;
    void eat();
}
    

 class Uma implements Person {

    /**
     * @param args the command line arguments
     */
      @Override
    public void eat() {
        System.out.println("Uma loves to eat sweet");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Uma u=new Uma();
        u.eat();
    }

  
         //To change body of generated methods, choose Tools | Templates.
    }
    

