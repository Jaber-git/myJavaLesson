/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;


public class q extends p 
{
int a=17,b=124;
   q()
   {
       System.out.println(" in side q");
   }
   //overriding
    void show1()
    {
        System.out.println("Hello from p");
    }
    void show2(){
    show1();
    super.show1();
    }
    
}
