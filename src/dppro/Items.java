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
public class Items<T> {
   private String details;
   public float price;
   public T obj;
   public Items(T _type,String details){
      this.details = details;		
      obj=_type;
   }
   public void executer() {
    //  System.out.println(obj+":  [Details : " + details+" ]");
   }
}
