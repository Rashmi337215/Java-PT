/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro10;

import java.util.Scanner;

/**
 *
 * @author SMV
 */
public class Pro10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scn=new Scanner(System.in);
      int a=scn.nextInt();
      int b=scn.nextInt();
      int sum=0;
      int rem=1;
              
      sum=(int) (sum+rem*Math.pow(a,b));
     
         System.out.println(sum);
      }
    }
    

