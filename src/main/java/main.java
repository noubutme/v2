import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.service.ShoppingCart;

public class main {
    public static void main(String[] args) {
        Food[] foods = {
                new Meat(5,100),
                new Apple(10,50, Colour.red),
                new Apple(8,60,Colour.green)
        };

        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println(cart.value());
        System.out.println(cart.valueDiscount());
        System.out.println(cart.vegValue());
    }
}
