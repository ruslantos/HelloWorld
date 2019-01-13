import java.lang.*;
public class ExStringBuilder {

    public static void main(String[] args) {
        StringBuilder sbf = new
                StringBuilder("Welcome geeks!");
        sbf.append(" hahah");
        System.out.println(sbf);

        System.out.println("capacity: " + sbf.capacity());

        String text = "Hello@$%$%$ World";
        System.out.println(text.replaceAll("[^a-zA-Z0-9]", ""));

        String s = "qwerty";
        StringBuilder text3 = new StringBuilder(s);
        StringBuilder text4 = text3.reverse();
        System.out.println(text4);

        String d = "rttr";
        System.out.println(isPalindrome(d));


    }

    public static boolean isPalindrome(String text) {
        String text2 = text.replaceAll("[^a-zA-Z0-9]", "");
        String text5 = text2.toLowerCase();
        StringBuilder text3 = new StringBuilder(text5);
        StringBuilder text4 = text3.reverse();
        return text5.toString().equals(text4.toString());
    }




}
