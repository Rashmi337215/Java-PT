/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program8;

/**
 *
 * @author SMV
 */
public class Program8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1="java developer";
        String s2="Java Tester";
        System.out.println(s1.contains("ava"));
        System.out.println(s1.contains(s2));
        System.out.println(s1.startsWith("java"));
        System.out.println(s1.startsWith("Java"));
        System.out.println(s1.endsWith("per"));
        System.out.println(s2.endsWith("developer"));
    }
    
}
