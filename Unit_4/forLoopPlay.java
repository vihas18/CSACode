package Unit_4;


import static Unit_4.printFunction.print;

public class forLoopPlay {
    public static void main(String[] args) {
        String first = new String("duck");

        String second = new String("duck");

        String third = new String("goose");

        if (first == second) {

            System.out.print("A");

        } else if (second == third) {

            System.out.print("B");

        } else if (first.equals(second)) {

            System.out.print("C");

        } else if (second.equals(third)) {

            System.out.print("D");

        } else {

            System.out.print("E");

        }
    }



    public static boolean isMiddle(int x1,int x2,int x3){
        int diff1 = Math.abs(x2 - x1), diff2 = Math.abs(x3 - x2);
        return (Math.abs(diff1 - diff2) <= 1 && Math.abs(diff1 - diff2) >= 0);


    }
    public static  String mult(String word, String sep){
        int len = word.length(), i = 0;
        String output = "";
        while (i < len){
            output += word + sep;
            i++;

        }
        return output;

    }



}
