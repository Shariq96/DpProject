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
public class Sprite extends Drinks implements IFood{
   @Override
    public int price()
    {
        return 25;
    }
     @Override
    public String name() 
    {
      return "Sprite soda";
    }
}
