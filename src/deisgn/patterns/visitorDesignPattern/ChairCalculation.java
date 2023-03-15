package deisgn.patterns.visitorDesignPattern;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author developer
 */

public class ChairCalculation implements IChairCalculations{
  public static final int DISCOUNT_FLOOR = 200;
    public static final int DISCOUNT_AMMOUNT = 400;
    @Override
    public int calculateChairEndCostWithDiscount(Chair chair) {
        int price = chair.getPrice();
        if(price > DISCOUNT_FLOOR){
            return price- DISCOUNT_AMMOUNT;
        }else {
            return price;
        }
    }

   



  
    
}
