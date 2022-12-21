import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food[] foods = {
                new Meat(5,100),
                new Apple(10,50, "red"),
                new Apple(8,60,"green")
        };

        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров без скидки: " + cart.value() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + cart.valueDiscount() + " руб.");
        System.out.println("Общая сумма вегетарианских товаров без скидки: " + cart.vegValue() + " руб.");
    }
}
