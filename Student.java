/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog03;

/**
 *
 * @author SMV
 */
public class Student{
    int age=10;
    String name="tom";
    void read(){
        System.out.println("read");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1=new Student();
        System.out.println(s1.age);
        System.out.println(s1.name);
        s1.read();
        
    }
    
}
