package Caveman;

/**
 * Class Caveman is an example of how to write a class
 *
 * @author vveggalam25
 * @version 0.1
 */
public class Cavemen {
    private int howStinky, vocab;
    private boolean canBuildFire, hasCave, hasMate;
    private int facialHair;//Scale of 1-10 (10 being most hair)
    private String name;
    private int numClubs;
    private double foodStash; //Weight of the total food in pounds
    public static final double MAX_HEIGHT = 5.9;
    public static final int CURRENT_YEAR = -100000;
    public static void print(Object o){
        System.out.println(o);
    }
    //*******************************CONSTRUCTORS********************
    //ALL Constructors:
    // (1) Have the same name as the class
    // (2) Have NO return type
    // (3) Purpose: to initialize all instance variables and set object up for use...

    /**
     *  Zero arg constructor - sets up a Caveman with default values
     */
    public Cavemen(){
        numClubs = 0;
        facialHair = 0;
        vocab = 0;
        howStinky = 5;
        canBuildFire = false;
        hasCave = true;
        hasMate = false;
        foodStash = 0;
        name = "unassigned";
    }
    public Cavemen(String n, int numWords) {
        facialHair = 0;
        howStinky = 5;
        canBuildFire = false;
        hasCave = true;
        name = n;
        foodStash = 0;
        vocab = numWords;
    }
    /**
     * Overloaded Constructor #2
     * @param n is the Caveman's name
     * @param h is how Stinky they are on a scale of 1-5 (int)
     * @param f is how much food they have in pounds (double)
     */
    public Cavemen(String n, int h, double f) {
        this(); //Sets the defaults
        this.name = n;//refers to instance variable
        howStinky = h;
        foodStash = f;

    }
}
