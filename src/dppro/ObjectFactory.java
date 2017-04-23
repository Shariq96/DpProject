/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dppro;

/**
 *
 * @author Sam
 */
import java.util.HashMap;

public class ObjectFactory {
   public static final HashMap<Items<?>,String> _hashMap = new HashMap();
  
   public static Items getObject(Items r,String _quantity) {
       if (_hashMap.containsValue(_quantity)) {
           System.out.println("Using Old Object of "+_quantity);
           return r;
       }
       Items _item= new Items(r,_quantity);
         _hashMap.put(_item,_quantity);
        System.out.println("Creating "+_quantity);
        
      return _item;
   }
}
