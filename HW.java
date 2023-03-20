import java.util.ArrayList;

public class HW {


    public static void main(String[] args) {
        int[] arr = {30, 40, 10, 50, 20};

        selectionSort(arr);
    }
    public static void insertionSort(int[] elements)

    {

        for (int j = 1; j < elements.length; j++)

        {

            int temp = elements[j];

            int possibleIndex = j;

            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])

            {

                elements[possibleIndex] = elements[possibleIndex - 1];

                possibleIndex--;   // line 10
                System.out.println("%");

            }

            elements[possibleIndex] = temp;

        }

    }
    public static String scrambleWord(String word){
        String out = "";
        int i = 0;
        for( i = 0; i < word.length()-1;i++){
            String f = word.substring(i,i+1);
            String s = word.substring(i+1,i+2);
            if(f.equals("A")){
                if(s.equals("A")){
                    out += f;
                    continue;

                }
                else{
                    out += s + f;
                    i++;
                }
            }
            else{
                out += f;
            }

        }
        if (i < word.length()){
            out += word.substring(i);
        }
        return out;
    }
    public static String scrambl345eWord(String word){
        int current = 0;
        String result="";
        while (current < word.length()-1){
            if (word.substring(current,current+1).equals("A") &&
                    !word.substring(current+1,current+2).equals("A")){
                result += word.substring(current+1,current+2);
                result += "A";
                current += 1;
            }
            else {
                result += word.substring(current,current+1);
                current++;
            }
        }
        if (current < word.length()){
            result += word.substring(current);
        }
        return result;
    }
    public static void selectionSort(int[] elements)

    {

        for (int j = 0; j < elements.length - 1; j++)

        {

            int minIndex = j;

            for (int k = j + 1; k < elements.length; k++)

            {

                if (elements[k] < elements[minIndex])

                {

                    minIndex = k;

                }

            }

            if (j != minIndex)

            {

                int temp = elements[j];

                elements[j] = elements[minIndex];
                System.out.print(2);

                elements[minIndex] = temp;   // line 19

            }

        }

    }
}

