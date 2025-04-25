/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog8;

/**
 *
 * @author SMV
 */
public class prog13 {
    public static void main(String[]args){
        int n=10;
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<n;j++)
        {
            if(i==0 ||i+j==n-1 || i==n-1)
            {
                System.out.print("*"+" ");
            }
            else
            {
            System.out.print(" "+" ");
            
            }
        }
    System.out.println();
        }
    }
}
    

    

