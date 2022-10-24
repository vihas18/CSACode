public class String_Testing {
    static String sam = "hey there";
    static String ben = "hey thar";
    public static void main(String[] args) {
        System.out.println(sam.compareTo(ben));
        System.out.println(ben.compareTo(sam));
        System.out.println(ben.compareTo("abc"));

    }
}
