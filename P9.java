/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p9;

/**
 *
 * @author SMV
 */
public class P9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==n-1){
                    System.out.print("*"+" ");
            }else{
                    System.out.print(" "+" ");
                }}
            System.out.println();
        }}}
        
    }
    
}
