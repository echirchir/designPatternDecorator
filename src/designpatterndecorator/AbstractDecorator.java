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
public abstract class AbstractDecorator extends Component{
    protected Component com;
    
    public void setTheComponent(Component component){
        com = component;
    }
    
    public void doJob(){
        if(com != null){
            com.doJob();
        }
    }
}
