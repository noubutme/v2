package model;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;
    protected double discount;

    public  Food(int amount,double price,boolean isVegetarian){
        this.amount=amount;
        this.price=price;
        this.isVegetarian = isVegetarian;
    }
    @Override
    public double getDiscount(){
        return discount;
    }
    public int getAmount(){
        return amount;
    }
    public double getPrice(){
        return price;
    }
    public boolean isVegetarian(){
        return isVegetarian;
    }
    }

