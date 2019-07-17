package lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println(reverse("Hello world!!!"));
    }

    public static String reverse(String str) {
        char[] revArray = str.toCharArray();
        String resultStr = "";
        for (int i = revArray.length-1; i>=0; i--){
            //System.out.print(revArray[i]);
            resultStr += revArray[i];
        }
        return resultStr;
    }
}
