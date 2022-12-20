package model;

import model.constants.Discount;

public class Meat extends Food{

    public Meat(int amount, int price){
        super(amount,price,false, Discount.unRedDiscount,"");
    }
    }
