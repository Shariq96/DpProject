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
public class ChickenBurger extends Burger implements IFood{
   @Override
    public int price()
    {
        return 120;
    }
     @Override
   public String name() {
      return "Chicken Burger";
   }
       
}
