package Pizza;

public class MyProgram {
    static String[] toppings = {"Spinach", "Egg", "Brocolli", "Raw Tomatoes", "Anchovies", "Clams", "Shrimp", "Pepperoni", "Sausage", "Mushroom", "Olives", "Chicken", "Onions", "Peppers", "None"};
    static String[] crusts = {"uncooked", "slighty undercooked", "cooked correct", "slighty overcooked", "burnt"};
    static int crustIndex = random(0,4);
    static int topping1 = 0;
    static int topping2 = 0;
    static int topping3 = 0;
    public static void main(String[] args){
        Pizza first = createPizza(crustIndex);

        while (scorePizza(first) < 9){
        first = createPizza(crustIndex);
        System.out.println(first.toString());
        System.out.println(scorePizza(first));}


    }
    public static Pizza createPizza(int crustIndex){
        Pizza p = new Pizza();
        p.setSize(random(8,14));
        p.setCrust(crusts[crustIndex]);
        p.setNumSlices(8);
        p.setCheese("Mozzarella");
        topping1 = random(0,14);
        topping2 = topping1;
        while (topping2 == topping1){
            topping2 = random(0,14);
        }
        topping3 = topping1;
        while (topping3 == topping1 || topping3 == topping2){
            topping3 = random(0,14);
        }
        String toppingString = toppings[topping1] + ", " + toppings[topping2] + ", and " + toppings[topping3];
        p.setToppings(toppingString);
        return p;
    }
    public static double scorePizza(Pizza p){
        double score = 0;
        score += (p.getSize() - 6);//Max Points 8
        score += (3 - Math.abs(2-crustIndex))*7;//Max Points is 21
        if(topping1 == 14){
            score += 0;
        }
        else if(topping1 > 6){
            score += 8;
        }
        else{
            score += 2;
        }
        if(topping2 == 14){
            score += 0;
        }
        else if(topping2 > 6){
            score += 8;
        }
        else{
            score += 2;
        }
        if(topping3 == 14){
            score += 0;
        }
        else if(topping3 > 6){
            score += 8;
        }
        else{
            score += 2;
        }//Max Topping 15
        score *= 50.0/59;

        return score/5;
    }
    public static int random(int min, int max){
        return (int) (Math.random()*(max-min))+min;
    }

}
