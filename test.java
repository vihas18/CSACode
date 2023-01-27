public class test {
    public static void main(String[] args){
        hourGlass(3);
    }
    public static void methodFifteen(){
        for (int i = 9; i > 0; i--){
            for (int j = 1; j <= i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void hourGlass(int levels){
        String[] output = new String[(levels+1) * 2];
        for (int i = 0; i < output.length; i++){
            output[i] = "";
        }
        for (int i = 0; i < output.length/2; i++){
            for (int j = 0; j <= output.length - (i * 2); j++){
                if (i == 0){
                    output[0] += "*";
                    output[output.length - 1] += "*";
                }
                else if(j == i){
                    output[i] += "\\";
                    output[output.length - 1 - i] += "/";
                }
                else if(j == output.length - (i * 2)){
                    output[i] += "/";
                    output[output.length - 1 - i] += "\\";
                }
                else if(j < i){
                    output[i] += " ";
                    output[output.length - 1 - i] += " ";
                }
                else{
                    output[i] += ".";
                    output[output.length - 1 - i] += ".";
                }
            }
        }
        for(String s: output){
            System.out.println(s);
        }
    }
}
