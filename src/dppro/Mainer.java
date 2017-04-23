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

import static java.lang.System.out;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Mainer {
    
    
   public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
CentralHub stock = new CentralHub();
stock.showMenu();
       
while(true)
{
String order = inp.next();
stock.orderPlace(order);
    if (stock.flag == false) {
        
        System.out.println("Your Total Bill is : "+ stock.getCost());
        System.out.println("Your Order has been Done. Pay and EnjoY");
        break;
    }
    
System.out.print("Enter Option: ");
}        
 
   
      
   }
}
