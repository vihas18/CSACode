package App_Functions;

import java.util.*;

import static Unit_4.printFunction.print;

class workoutCreator {
    public static String[][] exercises = {
            {"exercise5","exercise2","exercise3"},
            {"exercise1","exercise4","exercise5"},
            {"exercise6","exercise7"},
            {"exercise8","exercise9"}


    };
    public static String[] muscleNames = {"muscle0","muscle1","muscle2","muscle3","muscle4","muscle5","muscle6"};
    public static String[] sizes = {"small","big","small","small","big","small","small","big","small"};
    public static int[] muscles = {0,1,2};
    public static void main(String[] args) {

        String[] targets = {"strength","endurance","strength"};
        System.out.println(createWorkout(muscles, targets));
    }
    public static String createWorkout(int[] muscles, String[] targets){
        String workout = "";
        int maxExercises = 0;
        for(int i = 0; i < exercises.length; i++){
            if (Arrays.binarySearch(muscles, i) > -1){
                maxExercises+=exercises[i].length;
            }
        }
        String[] exerciseTypes = new String[maxExercises];
        int currentPos = 0;
        for (int muscleIndex:muscles){
            for(String e: exercises[muscleIndex]){
                exerciseTypes[currentPos] = e;
                currentPos++;
            }
        }

        exerciseTypes = sortFreq(exerciseTypes);

        return "done";
    }
    public static boolean contains(String[] s, String key){
        for (int  o = 0; o < s.length; o++){
            try {
                if (s[o].equals(key)) {
                    return true;
                }
            }
            catch(Exception e){
            }
        }
        return false;
    }
    public static String[] sortFreq(String[] s){
        String[] output = new String[countDistinct(s)];
        int index = 0;
        for (int i = 0; i < s.length; i++){
            String item = s[i];
            if(i > 0) {
                if (!contains(output, item)) {
                    output[index] = item;
                    index++;
                }
            }
            else{
                output[index] = item;
                index ++;
            }
        }
        Arrays.sort(output, new Comparator<String>(){

            public int compare(String o1, String o2)
            {
                return ("" + count(output,o2)).compareTo(("" + count(output,o1)));
            }
        });
        return output;
    }
    public static String[] sortSize(String[] s){
        String[] output = new String[s.length];
        Arrays.sort(output, new Comparator<String>(){

            public int compare(String o1, String o2)
            {
                return ("" + count(output,o2)).compareTo(("" + count(output,o1)));
            }
        });
        return output;
    }

    public static int countDistinct(String arr[]) {
        int n = arr.length;
        HashSet<String> hs = new HashSet<String>();

        for (int i = 0; i < n; i++) {
            // add all the elements to the HashSet
            hs.add(arr[i]);
        }

        // return the size of hashset as
        // it consists of all Unique elements
        return hs.size();
    }
    public static int count(Object[] s, Object item){
        int recurrences = 0;
        for (Object o:s){
            if (o.equals(item)){
                recurrences++;
            }
        }
        return recurrences;
    }

}