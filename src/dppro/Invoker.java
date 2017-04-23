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
    ArrayList<Order> q = new ArrayList<Order>();
    private List <Item> iitem = new ArrayList<Item>();
    public void addItem(Item _item)
    {
        iitem.add(_item);
    }
    
   
    public Invoker() {
    }
    
    void placeOrder(Order order) {
        if (q.size()>0) {
            
        q.add(q.size() - 1, order); 
        }
        else{
        q.add(0, order); 
        }
        Order r= q.remove(0);
        order.execute();
    }    
}
