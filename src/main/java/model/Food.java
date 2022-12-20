package model;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;
    protected int discount;
    protected String color;

    public  Food(int amount,double price,boolean isVegetarian, int discount, String color){
        this.amount=amount;
        this.price=price;
        this.isVegetarian = isVegetarian;
        this.discount = discount;
        this.color=color;
    }
    @Override
    public int getDiscount(){
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

