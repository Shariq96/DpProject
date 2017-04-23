/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dppro;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sam
 */
public class Invoker {
    //ArrayList<Order> q = new ArrayList<Order>();
    private List <Item> iitem = new ArrayList<Item>();
    public void addItem(Item _item)
    {
        iitem.add(_item);
    }
    
   
    public  ArrayList<IFood> food ;
    public Invoker() {
        food = new ArrayList<>();
    }
    
    void placeOrder(IFood order) {
        
        if (food.size()>0) {
            
        food.add(food.size() - 1, order); 
        }
        else{
        food.add(0, order); 
        }
//        order.execute();
    }    
}
