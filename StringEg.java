/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringeg;

/**
 *
 * @author SMV
 */
public class StringEg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1="java";
        String s2="Java";
        System.out.println(s1.equals(s2));
         System.out.println(s1.equalsIgnoreCase(s2));
         char[] arr=s1.toCharArray();
         for(int i=0;i<arr.length;i++){
              System.out.println(arr[i]);
         }
          System.out.println(s1.indexOf('a'));
           System.out.println(s1.lastIndexOf('a'));
    }
    
}
