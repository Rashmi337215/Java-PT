/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android;

/**
 *
 * @author SMV
 */
 abstract class Android
{
    void call(){
        System.out.println("calling ");
        
    }
    void text()
    {
        System.out.println("texting");
    }
    abstract void os();
}
class Redmi extends Android
{

    @Override
    void os() {
       System.out.println("MIUI os" );//To change body of generated methods, choose Tools | Templates.
    }
    
}
class Oneplus extends Android{

    @Override
    void os() {
       System.out.println("Oxygen os");//To change body of generated methods, choose Tools | Templates.
    }
    
}
public class Mobile{
    public static void main(String[]args){
        Oneplus op=new Oneplus();
        op.call();
        op.text();
        op.os();
        Redmi r=new Redmi();
        r.call();
        r.text();
        r.os();
    }
    
}


