package model.service;

import model.Food;

public class ShoppingCart {
    private final Food[] eda;

    public ShoppingCart(Food[] eda) {
        this.eda=eda;
    }

    public double value() {
        int value = 0;
        for (Food eda : this.eda) {
            value+=eda.getPrice()*eda.getAmount();
        }
        return value;
    }
    public double valueDiscount(){
        int value=0;
        for (Food eda : this.eda){
            value+=eda.getAmount()*(eda.getPrice()*eda.getDiscount()/100);
        }
     return value;
    }
    public double vegValue(){
        int value=0;
        for (Food eda : this.eda){
            if (eda.isVegetarian()){
                value+=eda.getPrice()*eda.getAmount();
            }else continue;
        }
        return value;
    }
}
