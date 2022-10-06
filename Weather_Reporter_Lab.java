import java.util.Scanner;

public class Weather_Reporter_Lab {
    public static void main(String[] args){
        Scanner weatherReader = new Scanner(System.in);
        int fahrenheit;
        int celsius;
        System.out.print("Welcome! I am the Weather Reporter!\n\nPlease enter degrees Fahrenheit");
        fahrenheit = weatherReader.nextInt();
        System.out.println(String.format("%d degrees Fahrenheit is equivalent to %d degrees"));
        System.out.print("Welcome! I am the Weather Reporter!\n\nPlease enter degrees Celsius");
        celsius = weatherReader.nextInt();
    }
    public static double toCelsius(int fahrenheit){
        double celsius = ( fahrenheit -32) * 5.0/9;
        return celsius;
    }
    public static double toFahrenheit(int celsius){
        double fahrenheit = celsius * 9/5.0 + 32;
        return fahrenheit;
    }
}
