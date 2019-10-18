/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author SAI
 */
public class Interface {
     public interface intr1
    {
        public void method1();
        
    }
     public interface intr2
    {
        public void method1();
        
    }
     public interface intr3 extends intr1,intr2
     {
        
          @Override
          public void method1();
         
     }
    
    public static void main(String[] args) {
      System.out.println("This is method one...");  
    }
    
}
