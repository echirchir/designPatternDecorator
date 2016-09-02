/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterndecorator;

/**
 *
 * @author rocket
 */
public class ConcreteDecoratorEx_2 extends AbstractDecorator{
    
    public void doJob(){
        
        System.out.println("");
        
        System.out.println("***START EX 2***");
        
        super.doJob();
        
        System.out.println("I am explicitly from Ex_2");
        
        System.out.println("***END EX 2***");
    }
    
}
