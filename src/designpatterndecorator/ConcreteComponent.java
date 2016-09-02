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
public class ConcreteComponent extends Component{

    @Override
    public void doJob() {
        System.out.println("I am from a concrete component, closed for modification");
    }
    
}
