public class Decipherer {

    public static String decipherer(String code) {

        String decode = code.substring(5, code.length() / 2);
        String replaceCode = decode.replaceAll("[@#?]", " ");
        String reverseCode = new StringBuilder(replaceCode).reverse().toString();

        return reverseCode;
    }

    public static void main(String[] args) {

        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

        System.out.println(decipherer(message1));
        System.out.println(decipherer(message2));
        System.out.println(decipherer(message3));
    }
}