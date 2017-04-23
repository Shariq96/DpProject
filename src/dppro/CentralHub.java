/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dppro;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author Sam
 */
public class CentralHub {
    ArrayList<IFood> food = new ArrayList<>();
    ArrayList<Integer> orderFood = new ArrayList<>();
    public void showMenu()
    {
        for (int i = 0; i < food.size();  i++) {
            System.out.println(i + " ) " +food.get(i).name());
        }
        System.out.println("5  ) For Deal5");
        System.out.println("press any othr key to terminate");
    }
    CentralHub()
    {
        food.add(new CheeseBurger());
        food.add(new ChickenBurger());
        food.add(new Pepsi());
        food.add(new Fanta());
        food.add(new Sprite());
        
        
        Deals.add(new CheeseBurger());
        Deals.add(new Fanta());
        Deals.add(new Pepsi());
        Deals.add(new Sprite());
        Deals.add(new ChickenBurger());
         d=new Deal(this);
        
    }
    Deal d;
    public void Dealer() {
        System.out.println("-------Your Deal-------");
        for(Item i:Deals){
                System.out.println("take = "+i.name());
         }
        System.out.println("-------Your Deal-------");
    }
    List<Item> Deals=new ArrayList<Item>();
    int paisa;
    public void invoke(Item fun)
    {
        System.out.println("Enter Quantity");
          int  quantity = Integer.parseInt(inp.nextLine());
              Item  b=fun;
            paisa = b.price()*quantity;
            Items _item = (Items)ObjectFactory.getObject(new Items<>(b,b.name()),b.name());
           System.out.println(quantity + " * " + b.price() + " = "+ paisa);
         _item.executer();
         orderFood.add(paisa);
    }
    int sum;
   public int getCost()
   {
       for (int food1 : orderFood) {
           sum += food1;
       }
       return sum;
   }
   boolean flag  =true;
    Scanner inp = new Scanner(System.in);
    public IFood orderPlace(String input)
        { 
            if (input.matches("0")) {
                invoke(new CheeseBurger());
            }
            else if (input.matches("1")) {
                invoke(new ChickenBurger());
            }
            else  if (input.matches("2")) {
                invoke(new Pepsi());
            }
            else  if (input.matches("3")) {
                invoke(new Sprite());
            }
            else  if (input.matches("4")) {
                invoke(new Fanta());
            }
            else if (input.matches("5")){
            d.execute();
            }
            else {
                flag = false;
                return null;
                
                }
               return null; 
            }
          
    }
    

