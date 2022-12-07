package Pizza;

public class MyProgram {
    static String[] badToppings = {"Spinach", "Egg", "Brocolli", "Raw Tomatoes", "Anchovies", "Clams", "Shrimp"};
    static String[] goodToppings = {"pepperoni", "sausage", "mushroom", "olives", "chicken", "onions", "peppers"};
    public static void main(String[] args){
        Pizza first = new Pizza();

    }
    public static Pizza createPizza(){
        Pizza p = new Pizza();
        int d = (int) (Math.random() * 7) + 8;
        return p;
    }

}
