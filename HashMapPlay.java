import java.util.*;
import java.util.stream.Collectors;

import static Unit_4.printFunction.print;

public class HashMapPlay {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1,6,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
        String[] strings = {"A","B","C","D","E","F","G"};
        String[] strings2 = {"A","B","C","D","E","F","G"};

        print(Arrays.compare(strings,strings2));
        HashMap<String, Integer> h = new HashMap<>()
        {{
            put("A",1);
            put("B",2);
            put("C",3);
            put("D",4);
            put("E",5);
            put("F",6);


        }};
        List<Integer> even = numbers.stream()
                        .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        for(int n:even){
            print(n);
        }
    }

}
