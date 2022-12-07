package Caveman;

import static Caveman.Cavemen.print;

public class CavemanRunner {
    public static void main(String[] args){
        Cavemen c = new Cavemen("Arel",1,456);

        print(c.getName());
        print(c.getStash());
        print(c.getStinkness());
        c.shower(40);
        print(c.getStinkness());


    }
}
