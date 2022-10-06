import java.util.Scanner;

public class Distance_demo {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double r, t, d;
        System.out.println("Welcome! How fast are you going today?");
        r = reader.nextDouble();

        System.out.println("How long are you travelling today?");
        t = reader.nextDouble();

        d = distance(r,t);
        System.out.println(String.format("Wow! You travelled %g", d));
    }
    public static double distance(double rate, double time){
        double distance = rate * time;
        return distance;
    }
}
