package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food{
    private  String color;

    public Apple(int amount, double price, String color){
        super(amount,price,true);
        this.color=color;
        }
@Override
    public double getDiscount(){
    if (color.equals(Colour.red)){
            this.discount=(price*Discount.Discount/100);
        }
        return discount;
}
}
