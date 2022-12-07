package Pizza;

import java.util.Scanner;

/**
 * class Pizza will be used to demonstrate how to write a class
 *
 * @author Santucci
 * @version 2022
 */
public class Pizza      //class header
{
    //INSTANCE VARIABLES
    private double size;            //diameter
    private String toppings;
    private String sauce;
    private String cheese;
    private String crust;
    private double price;
    private int yumminess;          //on a scale of 1-5
    private int numSlices;

    //CLASS CONSTANTS
    public static final double PIZZA_PI = Math.PI;


    //****************************************CONSTRUCTORS******************************************
    //All constructors:
    // (1) Have the SAME NAME as the class
    // (2) Have NO return type
    // (3) Purpose is to set up object for use
    // (4) A well designed class has multiple constructors

    /**
     * Zero-arg constructor or Default..takes no parameters
     * Purpose is to intialize all instance variables and set object up for use... 
     */
    public Pizza()
    {
        size = 10;
        toppings = "none";
        sauce = "tomato";
        cheese = "mozzarella";
        crust = "plain";
        price = 14.50;
        yumminess = 1;
        numSlices = 8;
        //could provide additional code to set up object if needed
    }

    /**
     * Overloaded Constructor #1
     * initializes to values provided by the user
     * @param s as a double, topppings as a String, and price
     */
    public Pizza(double s, String t, double p)
    {
        size = s;
        toppings = t;
        sauce = "tomato";
        cheese = "mozzarella";
        crust = "plain";
        price = p;
        yumminess = 1;
        numSlices = 8;
    }

    /**
     * Overloaded Constructor #2
     * @param crust type of crust and numSlices how many slices
     */
    public Pizza(String crust, int numSlices)
    {
        this();             //calls the zero-arg constructor for this class - CONSTRUCTOR CHAINING, must be the first line
        this.crust = crust; //assigns to the instance variable
        this.numSlices = numSlices;
    }


    //******************************METHODS*******************************************/

    //MUTATOR METHODS - can be setters or anything that changes the state of your object

    /**
     * Sets the size of the Pizza
     * @param size is the diameter of the pizza
     */
    public void setSize(double size)
    {
        this.size = size;
    }

    /**
     * Sets the toppings on the Pizza
     * @param t represents the toppings ordered for example: pepperoni, mushrooms, pineapple, etc...
     */
    public void setToppings(String t)
    {
        toppings = t;
    }

    /**
     * Sets the crust on the Pizza
     * @param crust is the type of crust ordered, for example: stuffed, Grandma, focaccia, Sicilian,...
     */
    public void setCrust(String crust)
    {
        this.crust = crust;
    }

    /**
     * Sets the cheese on the Pizza 
     * @param cheese is the type of cheese, for example: ricotta, no-cheese
     */
    public void setCheese(String cheese)
    {
        this.cheese = cheese;
    }

    /**
     * Sets the number of Slices
     * @param numSlices is the number of Slices
     */
    public void setNumSlices(int numSlices)
    {
        this.numSlices = numSlices;
    }

    /**
     * Sets the price
     * @param p is the price of the Pizza
     */
    public void setPrice(double p)
    {
        price = p;
    }

    /**
     * Sets yumminess of this Pizza
     * @param yum is the yumminess rating on a scale of 1-5
     */
    public void setYumminess(int yum)
    {
        yumminess = yum;
    }

    //ACCESSOR METHODS - provide public access to private instance variables

    /**
     * Gets the size of this Pizza
     * @return the size of this Pizza (diameter in inches)
     */
    public double getSize()
    {
        return size;
    }

    /**
     * A pizza has toppings listed as a String
     * @return the toppings on this Pizza
     */
    public String getToppings()
    {
        return toppings;
    }

    /**
     * @return the type of sauce on this Pizza
     */
    public String getSauce()
    {
        return sauce;
    }

    /**
     * @return the type of cheese on this Pizza (for example mozarella, ricotta, no-cheese, three-cheese,...)
     */
    public String getCheese()
    {
        return cheese;
    }

    /**
     * @return the type of crust on this Pizza (for example: stuffed, Sicilian, Grandma, herb-crusted...)
     */
    public String getCrust()
    {
        return crust;
    }

    /**
     * @return the price of this Pizza in $ (price is for the WHOLE pizza, not per slice)
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * @return yumminess which is a measure of this Pizza's yumminess on a scale of 1-5
     */
    public int getYumminess()
    {
        return yumminess;
    }


    //OTHER METHODS
    /**
     * @return the number of slices left for this Pizza pie after some have been eaten.
     */
    public int getNumSlicesLeft()
    {
        return numSlices;
    }

    /**
     * Prompts the user for a rating on this Pizza
     * Guaranteed that the user will a valid response 1-5
     * @return the users rating
     */
    public int getRating()
    {
        Scanner ratingReader = new Scanner(System.in);
        int rating;

        //Prompt the user
        System.out.println("How was your pizza (on a scale of 1-5?): ");
        rating = ratingReader.nextInt();
        return rating;
    }

    /**
     * Eat one slice of pizza, update numSlices left, and get a rating
     * You may NOT eat a burnt pizza
     */
    public void eat()
    {
        if(yumminess == 0)
            System.out.println("Sorry, this Pizza is burnt! You can not have any!");
        else
        {
            numSlices--;
            yumminess = getRating();
        }
    }

    /**
     * Overloaded eat pizza, update numSlices left, and get a rating
     * @param howMany is the number of slices to be eaten
     * You may NOT eat a burnt pizza
     */
    public void eat(int howMany)
    {
        System.out.println("Wash up and get ready to eat!");
        if(yumminess == 0)
            System.out.println("\nSorry, this Pizza is burnt! You can not have any!");
        else
        {
            numSlices -= howMany;
            yumminess = getRating();
        }

    }

    /**
     * Mutator method that burns the pizza: crust becomes burnt
     * yumminess becomes 0
     */
    public void burn()
    {
        crust = "burnt";
        yumminess = 0;
    }

    /**
     * @returns the current state of this Pizza as a String
     */
    public String toString()
    {
        return "Size: " + size + "\nToppings: " + toppings
                + "\nSauce type: " + sauce + "\nCheese type: "
                + cheese + "\nCrust type: " + crust +
                "\nPrice: " + price + "\nYumminess (1-5): "
                + yumminess + "\nSlices left: " + numSlices;
    }
}