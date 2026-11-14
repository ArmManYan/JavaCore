package overload;

public class Pizza {
    static void main(String[] args) {
        String pizza = bakePizza("flat bread ", "mozzarella", "pepperoni");
        System.out.println(pizza);

    }

    static String bakePizza(String bread) {
        return bread + "pizza";
    }

    static String bakePizza(String bread, String cheeze) {
        return cheeze + " " + bread + "pizza";
    }

    static String bakePizza(String bread, String cheeze, String topping) {
        return cheeze + " " + topping + " " + bread + "pizza";
    }
}

