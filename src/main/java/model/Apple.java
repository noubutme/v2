package model;

import model.constants.Discount;

public class Apple extends Food{
    private final String color = "red";
    public Apple(int amount, double price, String color){
        super(amount,price,true,Discount.unRedDiscount,color);
        }
  }
