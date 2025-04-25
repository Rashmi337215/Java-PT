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
public class Squarepattern {
    public static void main(String[]args){
        int n=5;
        char ch='a';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            ch='a';
            System.out.println();
            }
        }
    }
    

