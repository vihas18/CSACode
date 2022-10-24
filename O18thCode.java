public class O18thCode {
    public static void main(String[] args){

        print(round(-3.6));
    }
    public static double average(int[] list){
        double total = 0;
        for (int a:list){
            total += a;
        }
        total /= list.length;
        return total;
    }
    public static int round(double number){
        if (number >= 0){
            return (int)(number + .5);
        }
        else{
            return (int)(number - .5);
        }
    }
    public static void print(Object o){
        System.out.println(o);
    }
}
