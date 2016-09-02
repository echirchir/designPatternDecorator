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
public class ConcreteDecoratorEx_1 extends AbstractDecorator{
    
    public void doJob(){
        super.doJob();
        
        System.out.println("I am explicitly from Ex_1");
    }
    
}
