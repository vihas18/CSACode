public class O14thCode {
    public static void nothing(int a, int b){
        int temp = a;
        a = b;
        b = a;
    }
    public static void intToDouble(int number){
        double num = 0;
        num += number;
        print(num);
    }
    public static void printInt(int val){
        double num = 0;
        num += val;
        print(val);
    }
    public static double average(int num1, int num2, int num3){
        double average;
        average = num1 + num2 + num3;
        return average/3.0;
    }
    public static int round(double num){
        int output = (int) (num + .5);
        return output;
    }
    public static double hypotenuse(double a, double b){
        double c;
        c = Math.pow(a,2);
        c += Math.pow(b,2);
        c = Math.sqrt(c);
        return c;
    }
    public static String lastfirst(String s1, String s2){
        String output = "";
        output += s2.substring(0,1);
        output += s1.substring(s1.length() - 1);
        return output;

    }
    public static void print(Object x){
        System.out.println(x);
    }
    public static void main(String[] args){
        int x = 8, y = 10;
        nothing(x,y);
        print((x + " " + y));

        intToDouble(8);
        printInt(10);
        print(average(6,8,10));
        print(round(6.5));
        print(hypotenuse(6,8));
        print(lastfirst("free","brave"));
    }
}
