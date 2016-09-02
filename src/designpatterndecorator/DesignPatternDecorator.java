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
public class DesignPatternDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Decorator design pattern demo");
        
        ConcreteComponent concreteComponent = new ConcreteComponent();
        
        ConcreteDecoratorEx_1 cd1 = new ConcreteDecoratorEx_1();
        
        cd1.setTheComponent(concreteComponent);
        cd1.doJob();
        
        ConcreteDecoratorEx_2 cd2 = new ConcreteDecoratorEx_2();
        cd2.setTheComponent(cd1);
        cd2.doJob();
    }
    
}
