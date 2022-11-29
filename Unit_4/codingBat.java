package Unit_4;

import static Unit_4.printFunction.print;

public class codingBat {
    public static void main(String[] args){
        print(String2SameStarChar("*xa*a*b"));
    }

    public static boolean String2SameStarChar(String str){
        String end = "end";
        String front = "front";
        for(int i = 1; i < str.length() - 2; i++){
            if (!str.contains("*")){
                return true;
            }
            int index = str.indexOf("*",i);
            if(index <= 0){
                continue;
            }
            front = str.substring(index-1, index);
            end = str.substring(index+1, index+2);
            print(front+end);


            if(!front.equals(end)){
                return false;
            }
        }
        return true;


    }

}
