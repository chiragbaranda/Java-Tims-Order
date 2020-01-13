/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timsorder;

import java.awt.Color;

/**
 *
 * @author CHIRAG BARANDA 000759867
 */
public class Mug extends TimsProduct {

    Color color;

    public Mug(Color color, String name, double cost, double price) {
        super(name, cost, price);
        this.color = color;
    }
    
   public static Mug Create()
   {
       return null;
   }

    @Override
    public String toString() 
    {
        
        return super.toString()+"Mug{" + "color=" + color + '}';
    }
   
   
}
